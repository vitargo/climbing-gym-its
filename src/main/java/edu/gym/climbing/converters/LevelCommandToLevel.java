package edu.gym.climbing.converters;

import edu.gym.climbing.commands.LevelCommand;
import edu.gym.climbing.model.Level;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class LevelCommandToLevel implements Converter<LevelCommand, Level>{
    @Synchronized
    @Nullable
    @Override
    public Level convert(LevelCommand source) {
        if(source == null){
            return null;
        }
        final Level level = new Level();
        level.setId(source.getId());
        level.setName(source.getName());
        return level;
    }
}
