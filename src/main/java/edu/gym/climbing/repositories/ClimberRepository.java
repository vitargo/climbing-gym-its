package edu.gym.climbing.repositories;


import edu.gym.climbing.model.Climber;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClimberRepository extends CrudRepository<Climber, Long> {

    Optional<Climber> getClimberByFbId(String fbId);
}
