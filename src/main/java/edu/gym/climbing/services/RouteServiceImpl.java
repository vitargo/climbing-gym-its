package edu.gym.climbing.services;

import edu.gym.climbing.commands.RouteCommand;
import edu.gym.climbing.model.Route;
import edu.gym.climbing.services.RouteServices;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class RouteServiceImpl implements RouteServices {
    @Override
    public RouteCommand getByName(String name) {
        return null;
    }

    @Override
    public Set<Route> getAll() {
        return null;
    }

    @Override
    public Route getById(long id) {
        return null;
    }

    @Override
    public void deleteById(long id) {

    }
}
