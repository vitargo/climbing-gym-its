package edu.gym.climbing.bootstrap;

import edu.gym.climbing.model.*;
import edu.gym.climbing.repositories.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.*;

@Slf4j
@Component
public class ClimbingGymBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private final CountryRepository countryRepository;
    private final GymRepository gymRepository;
    private final LevelRepository levelRepository;
    private final ClimberRepository climberRepository;
    private final EventRepository eventRepository;

    private final RouteRepository routeRepository;
    private final RouteTypeRepository routeTypeRepository;

    public ClimbingGymBootstrap(CountryRepository countryRepository, GymRepository gymRepository, LevelRepository levelRepository, ClimberRepository climberRepository, EventRepository eventRepository, RouteRepository routeRepository, RouteTypeRepository routeTypeRepository) {
        this.countryRepository = countryRepository;
        this.gymRepository = gymRepository;
        this.levelRepository = levelRepository;
        this.climberRepository = climberRepository;
        this.eventRepository = eventRepository;
        this.routeRepository = routeRepository;
        this.routeTypeRepository = routeTypeRepository;
    }

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {
        log.info("Load BootStrapData...");
        gymRepository.saveAll(getGyms());
        climberRepository.saveAll(getClimbers());
        eventRepository.saveAll(getEvents());
        routeRepository.saveAll(getRoutes());
    }

    private List<Gym> getGyms() {
        List<Gym> gyms = new ArrayList<>();

        Gym gymSpace = new Gym();
        gymSpace.setAddress("Peremogy-str,1");
        gymSpace.setCity("Kyiv");
        gymSpace.setCountry(getCountry("UKRAINE"));
        gymSpace.setDescription("Desc...");
        gymSpace.setWebLink("www.space.com.ua");
        gymSpace.setName("Space");
        gymSpace.setPhone("+380670011222");
        gyms.add(gymSpace);

        Gym gymClimber = new Gym();
        gymClimber.setAddress("Ukraine-ave,11");
        gymClimber.setCity("Krakiv");
        gymClimber.setCountry(getCountry("POLAND"));
        gymClimber.setDescription("Desc...");
        gymClimber.setWebLink("www.climber.com.pl");
        gymClimber.setName("Climber");
        gymClimber.setPhone("+4357493754");
        gyms.add(gymClimber);

        Gym gym = new Gym();
        gym.setAddress("Win ave, 100");
        gym.setCity("Krakiv");
        gym.setCountry(getCountry("POLAND"));
        gym.setDescription("The small climbing gym in Krakiv...");
        gym.setWebLink("www.rock.com.pl");
        gym.setName("Rock");
        gym.setPhone("+435745645");
        gyms.add(gym);

        return gyms;
    }

    private List<Climber> getClimbers() {
        List<Climber> climbers = new ArrayList<>();

        Climber climber1 = new Climber();
        climber1.setFirstName("Nina");
        climber1.setLastName("Koval");
        climber1.setCity("Kyiv");
        climber1.setCountry(getCountry("UKRAINE"));
        climber1.setFbId("qweqweqweqfsxf");
        climber1.setLevel(getLevel("ADVANCED"));
        climber1.setWeight(55);
        climbers.add(climber1);

        Climber climber2 = new Climber();
        climber2.setFirstName("Olha");
        climber2.setLastName("Proc");
        climber2.setCity("Krakiv");
        climber2.setCountry(getCountry("POLAND"));
        climber2.setFbId("fgksldfgjskd");
        climber2.setLevel(getLevel("BEGINNER"));
        climber2.setWeight(62);
        climbers.add(climber2);
        return climbers;
    }

    private List<Event> getEvents() {
        List<Event> events = new ArrayList<>();
        List<Gym> gyms = (List<Gym>) gymRepository.findAll();
        List<Climber> climbers = (List<Climber>) climberRepository.findAll();

        Event event = new Event();
        event.setName("Climbing Fest");
        event.setAddress("Krakiv, Win str., 100");
        event.setDescription("Cool fast");
        event.setPrice("100 zl");
        event.setGym(gyms.size() !=0?gyms.get(0):null);
        event.setParticipants(new HashSet(climbers));
        event.setDateFrom(new Date());
        event.setDateTill(new Date(System.currentTimeMillis() +10000000));

        events.add(event);
        return events;
    }

    private List<Route> getRoutes() {
        List<Route> routes = new ArrayList<>();

        Route route1 = new Route();
        route1.setName("Briliant");
        route1.setComment("Very hard route...");
        route1.setType(getRouteType("INDOOR"));
        route1.setLevel(getLevel("EXPERT"));

        routes.add(route1);

        return routes;
    }

    private Country getCountry(String name){
        Optional<Country> country = countryRepository.getCountryByName(name);
        if(country.isEmpty()){
            throw new RuntimeException(name + " Not Found");
        }
        return country.get();
    }

    private Level getLevel(String name){
        Optional<Level> level = levelRepository.getLevelByName(name);
        if(level.isEmpty()){
            throw new RuntimeException(name + " Not Found");
        }
        return level.get();
    }

    private RouteType getRouteType(String name){
        Optional<RouteType> routeType = routeTypeRepository.getRouteTypeByName(name);
        if(routeType.isEmpty()){
            throw new RuntimeException(name + " Not Found");
        }
        return routeType.get();
    }
}
