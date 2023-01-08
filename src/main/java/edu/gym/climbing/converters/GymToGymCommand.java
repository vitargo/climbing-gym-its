package edu.gym.climbing.converters;

import edu.gym.climbing.commands.GymCommand;
import edu.gym.climbing.model.Gym;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class GymToGymCommand implements Converter<Gym, GymCommand>{
    @Override
    public GymCommand convert(Gym source) {
        return null;
    }
}
