package edu.gym.climbing.converters;

import edu.gym.climbing.commands.LevelCommand;
import edu.gym.climbing.model.Level;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class LevelToLevelCommand implements Converter<Level, LevelCommand>{
    @Synchronized
    @Nullable
    @Override
    public LevelCommand convert(Level source) {
        if(source == null){
            return null;
        }
        final LevelCommand command = new LevelCommand();
        command.setId(source.getId());
        command.setName(source.getName());
        return command;
    }
}
