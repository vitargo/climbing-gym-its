package edu.gym.climbing.converters;

import edu.gym.climbing.commands.SectorCommand;
import edu.gym.climbing.model.Sector;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class SectorCommandToSector implements Converter<SectorCommand, Sector>{
    @Override
    public Sector convert(SectorCommand source) {
        if(source == null){
            return null;
        }
        final Sector sector = new Sector();
        sector.setId(source.getId());
        sector.setName(source.getName());
        sector.setGym(source.getGym());
        sector.setDate(source.getDate());
        return sector;
    }
}
