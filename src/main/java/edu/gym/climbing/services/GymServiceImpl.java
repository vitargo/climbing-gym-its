package edu.gym.climbing.services;

import edu.gym.climbing.commands.GymCommand;
import edu.gym.climbing.model.Gym;
import edu.gym.climbing.repositories.GymRepository;
import edu.gym.climbing.services.GymService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Slf4j
@Service
public class GymServiceImpl implements GymService {

    private final GymRepository gymRepository;

    public GymServiceImpl(GymRepository gymRepository) {
        this.gymRepository = gymRepository;
    }

    @Override
    public GymCommand getByName(String name) {
        return null;
    }

    @Override
    public Set<Gym> getAll() {
        Set<Gym> gyms = new HashSet<>();
        gymRepository.findAll().iterator().forEachRemaining(gyms::add);
        return gyms;
    }

    @Override
    public Gym getById(long id) {
        Optional<Gym> gymOptional = gymRepository.findById(id);
        return gymOptional.orElse(null);
    }

    @Override
    public void deleteById(long id) {
        gymRepository.deleteById(id);
    }
}
