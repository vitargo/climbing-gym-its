package edu.gym.climbing.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class RouteController {

    @GetMapping
    @RequestMapping("route/info/{Id}")
    public String getRouteInfo(@PathVariable String id){
        return "route/infopage";
    }

    @GetMapping
    @RequestMapping("route/gym/{Id}")
    public String getAllGymRoutes(@PathVariable String id){
        return "route/gym/routelist";
    }

    @PostMapping
    @RequestMapping("route/register")
    public String addRoute(){
        return "route/registration";
    }

    @PostMapping
    @RequestMapping("route/update/{Id}")
    public String updateRoute(@PathVariable String id, Model model){
        return "route/updatepage";
    }

    @RequestMapping("route/delete/{id}")
    public String deleteRoute(@PathVariable String id){
        return "redirect:/";
    }
}
