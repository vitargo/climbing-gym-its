package edu.gym.climbing.converters;

import edu.gym.climbing.commands.CountryCommand;
import edu.gym.climbing.model.Country;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class CountryCommandToCountry implements Converter<CountryCommand, Country>{
    @Synchronized
    @Nullable
    @Override
    public Country convert(CountryCommand source) {
        if(source == null){
            return null;
        }
        final Country country = new Country();
        country.setId(source.getId());
        country.setName(source.getName());
        return country;
    }
}
