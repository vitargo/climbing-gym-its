package edu.gym.climbing.repositories;

import edu.gym.climbing.model.Event;
import edu.gym.climbing.model.Gym;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EventRepository extends CrudRepository<Event, Long> {

    Optional<Event> getEventByGym(Gym gym);
}
