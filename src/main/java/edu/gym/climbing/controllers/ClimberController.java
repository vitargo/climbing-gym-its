package edu.gym.climbing.controllers;

import edu.gym.climbing.services.ClimberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class ClimberController {
    private final ClimberService service;

    public ClimberController(ClimberService service) {
        this.service = service;
    }
    @GetMapping
    @RequestMapping("climber/info/{Id}")
    public String getClimberInfo(@PathVariable String id){
        return "climber/infopage";
    }

    @PostMapping
    @RequestMapping("climber/register")
    public String addClimber(){
        return "climber/registration";
    }

    @PostMapping
    @RequestMapping("climber/update/{Id}")
    public String updateClimber(@PathVariable String id, Model model){
        return "climber/updatepage";
    }

    @RequestMapping("climber/delete/{id}")
    public String deleteClimber(@PathVariable String id){
        return "redirect:/";
    }
}
