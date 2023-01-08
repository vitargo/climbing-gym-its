package edu.gym.climbing.controllers;

import edu.gym.climbing.services.GymService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    private final GymService gymService;

    public IndexController(GymService gymService) {
        this.gymService = gymService;
    }

    @RequestMapping({"", "/", "/index"})
    String getIndex(Model model) {
        log.trace("Getting index page...");
        model.addAttribute("gyms", gymService.getAll());

        return "index";
    }
}
