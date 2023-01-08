package edu.gym.climbing.repositories;

import edu.gym.climbing.model.Level;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface LevelRepository extends CrudRepository<Level, Long> {
    Optional<Level> getLevelByName(String name);
}
