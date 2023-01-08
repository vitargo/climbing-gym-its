package edu.gym.climbing.services;

import edu.gym.climbing.commands.ClimberCommand;

public interface ClimberService {

    ClimberCommand getByFbId (String fbId);


}
