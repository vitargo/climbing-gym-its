package edu.gym.climbing.services.impl;

import edu.gym.climbing.commands.EventCommand;
import edu.gym.climbing.model.Climber;
import edu.gym.climbing.model.Event;
import edu.gym.climbing.model.Gym;
import edu.gym.climbing.repositories.EventRepository;
import edu.gym.climbing.services.EventService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public EventCommand getByGym(Gym gym) {
        return null;
    }

    @Override
    public Event getByGymId(Gym gym) {
        Optional<Event> eventOptional = eventRepository.getEventByGym(gym);
        return eventOptional.orElse(null);
    }

    @Override
    public Set<Climber> getEventParticipants(long id) {
        Event event = eventRepository.findById(id).orElse(new Event());
        Set<Climber> participants = event.getParticipants();
        return participants;
    }
}
