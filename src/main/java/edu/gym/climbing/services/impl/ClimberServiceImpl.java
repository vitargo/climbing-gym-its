package edu.gym.climbing.services.impl;

import edu.gym.climbing.commands.ClimberCommand;
import edu.gym.climbing.converters.ClimberToClimberCommand;
import edu.gym.climbing.model.Climber;
import edu.gym.climbing.repositories.ClimberRepository;
import edu.gym.climbing.services.ClimberService;
import org.springframework.stereotype.Service;

@Service
public class ClimberServiceImpl implements ClimberService {
    private final ClimberRepository climberRepository;
    private final ClimberToClimberCommand convertor;

    public ClimberServiceImpl(ClimberRepository climberRepository, ClimberToClimberCommand convertor) {
        this.climberRepository = climberRepository;
        this.convertor = convertor;
    }

    @Override
    public ClimberCommand getByFbId(String fbId) {
        return convertor.convert(climberRepository.getClimberByFbId(fbId).orElse(new Climber()));
    }
}
