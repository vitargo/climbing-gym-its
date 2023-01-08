package edu.gym.climbing.controllers;

import edu.gym.climbing.model.Climber;
import edu.gym.climbing.model.Event;
import edu.gym.climbing.model.Gym;
import edu.gym.climbing.services.EventService;
import edu.gym.climbing.services.GymService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Slf4j
@Controller
public class GymController {

    private final GymService gymService;
    private final EventService eventService;

    public GymController(GymService gymService, EventService eventService) {
        this.gymService = gymService;
        this.eventService = eventService;
    }

    @GetMapping
    @RequestMapping("gym/info/{gymId}")
    public String getGymInfo(@PathVariable String gymId,
                                Model model){
        log.debug("Get gym info");
        model.addAttribute("gym", gymService.getById(Long.parseLong(gymId)));
        return "gyms/gymsinfo";
    }

    @GetMapping
    @RequestMapping("gym/events/{gymId}")
    public String getGymEvents(@PathVariable String gymId,
                             Model model){
        log.debug("Get gym events");
        Event event = eventService.getByGymId(gymService.getById(Long.parseLong(gymId)));
        Event empty = new Event();
        empty.setGym(new Gym());
        model.addAttribute("event", event == null?empty:event);
        return "gyms/gymevents";
    }

    @GetMapping
    @RequestMapping("/gym/event/participants/{eventId}")
    public String getGymEventParticipants(@PathVariable String eventId, Model model){
        log.debug("Get gym event participants");
        Set<Climber> participants = eventService.getEventParticipants(Long.parseLong(eventId));
        model.addAttribute("participants", participants);
        return "gyms/participants";
    }

    @RequestMapping("gym/delete/{id}")
    public String deleteGym(@PathVariable String id){
        log.debug("Deleting id: " + id);
        gymService.deleteById(Long.valueOf(id));
        return "redirect:/";
    }
}
