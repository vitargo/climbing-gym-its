package edu.gym.climbing.services;

import edu.gym.climbing.commands.GymCommand;
import edu.gym.climbing.model.Gym;

import java.util.Set;

public interface GymService {

    GymCommand getByName(String name);

    Set<Gym> getAll();

    Gym getById(long id);

    void deleteById(long id);
}
