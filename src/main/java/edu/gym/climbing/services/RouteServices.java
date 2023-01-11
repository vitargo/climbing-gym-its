package edu.gym.climbing.services;

import edu.gym.climbing.commands.RouteCommand;
import edu.gym.climbing.model.Route;

import java.util.Set;

public interface RouteServices {

    RouteCommand getByName(String name);

    Set<Route> getAll();

    Route getById(long id);

    void deleteById(long id);
}
