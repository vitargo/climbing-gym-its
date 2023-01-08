package edu.gym.climbing.converters;

import edu.gym.climbing.commands.RouteTypeCommand;
import edu.gym.climbing.model.RouteType;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class RouteTypeToRouteTypeCommand implements Converter<RouteType, RouteTypeCommand>{
    @Synchronized
    @Nullable
    @Override
    public RouteTypeCommand convert(RouteType source) {
        if (source == null) {
            return null;
        }
        final RouteTypeCommand command = new RouteTypeCommand();
        command.setId(source.getId());
        command.setName(source.getName());
        return command;
    }
}
