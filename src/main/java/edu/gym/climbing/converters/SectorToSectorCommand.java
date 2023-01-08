package edu.gym.climbing.converters;

import edu.gym.climbing.commands.SectorCommand;
import edu.gym.climbing.model.Sector;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class SectorToSectorCommand implements Converter<Sector, SectorCommand>{
    @Synchronized
    @Nullable
    @Override
    public SectorCommand convert(Sector source) {
        if(source == null){
            return null;
        }
        final SectorCommand command = new SectorCommand();
        command.setId(source.getId());
        command.setName(source.getName());
        command.setGym(source.getGym());
        command.setDate(source.getDate());
        return command;
    }
}
