package edu.gym.climbing.controllers;

import edu.gym.climbing.services.ClimberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

@Slf4j
@Controller
public class ClimberController {
    private final ClimberService service;

    public ClimberController(ClimberService service) {
        this.service = service;
    }
}
