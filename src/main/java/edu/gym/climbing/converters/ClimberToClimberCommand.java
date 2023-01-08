package edu.gym.climbing.converters;

import edu.gym.climbing.commands.ClimberCommand;
import edu.gym.climbing.model.Climber;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ClimberToClimberCommand implements Converter<Climber, ClimberCommand> {
    @Synchronized
    @Nullable
    @Override
    public ClimberCommand convert(Climber source) {
        return null;
    }
}
