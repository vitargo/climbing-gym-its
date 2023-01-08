package edu.gym.climbing.converters;

import edu.gym.climbing.commands.ComplexityCommand;
import edu.gym.climbing.model.Complexity;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ComplexityCommandToComplexity implements Converter<ComplexityCommand, Complexity>{
    @Synchronized
    @Nullable
    @Override
    public Complexity convert(ComplexityCommand source) {
        if(source == null){
            return null;
        }
        final Complexity complexity = new Complexity();
        complexity.setId(source.getId());
        complexity.setName(source.getName());
        return complexity;
    }
}
