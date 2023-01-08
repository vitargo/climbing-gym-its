package edu.gym.climbing.services;

import edu.gym.climbing.commands.EventCommand;
import edu.gym.climbing.model.Climber;
import edu.gym.climbing.model.Event;
import edu.gym.climbing.model.Gym;
;
import java.util.Set;

public interface EventService {

    EventCommand getByGym(Gym gym);

    Event getByGymId(Gym gym);

    Set<Climber> getEventParticipants(long id);
}
