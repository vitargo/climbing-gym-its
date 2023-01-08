package edu.gym.climbing.converters;

import edu.gym.climbing.commands.ComplexityCommand;
import edu.gym.climbing.model.Complexity;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class ComplexityToComplexityCommand implements Converter<Complexity, ComplexityCommand>{
    @Synchronized
    @Nullable
    @Override
    public ComplexityCommand convert(Complexity source) {
        if(source == null){
            return null;
        }
        final ComplexityCommand command = new ComplexityCommand();
        command.setId(source.getId());
        command.setName(source.getName());
        return command;
    }
}
