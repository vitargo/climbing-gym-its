package edu.gym.climbing.converters;


import edu.gym.climbing.commands.ClimberCommand;
import edu.gym.climbing.model.Climber;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ClimberCommandToClimber implements Converter<ClimberCommand, Climber> {

    @Override
    public Climber convert(ClimberCommand source) {
        return null;
    }
}
