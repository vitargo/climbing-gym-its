package edu.gym.climbing.repositories;

import edu.gym.climbing.model.Country;
import edu.gym.climbing.model.Gym;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GymRepository extends CrudRepository<Gym, Long> {

    Optional<Gym> getGymById(long id);
}
