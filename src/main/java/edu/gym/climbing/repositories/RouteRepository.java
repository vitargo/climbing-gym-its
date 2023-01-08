package edu.gym.climbing.repositories;

import edu.gym.climbing.model.Route;
import org.springframework.data.repository.CrudRepository;

public interface RouteRepository extends CrudRepository<Route, Long> {
}
