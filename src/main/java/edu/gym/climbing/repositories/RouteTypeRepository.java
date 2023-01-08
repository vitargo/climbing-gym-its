package edu.gym.climbing.repositories;

import edu.gym.climbing.model.RouteType;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RouteTypeRepository extends CrudRepository<RouteType, Long> {

    Optional<RouteType> getRouteTypeByName(String name);
}
