package edu.gym.climbing.repositories;

import edu.gym.climbing.model.Country;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CountryRepository extends CrudRepository<Country, Long> {

    Optional<Country> getCountryByName(String name);
}
