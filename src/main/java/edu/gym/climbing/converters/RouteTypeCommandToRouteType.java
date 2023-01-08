package edu.gym.climbing.converters;

import edu.gym.climbing.commands.RouteTypeCommand;
import edu.gym.climbing.model.RouteType;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class RouteTypeCommandToRouteType implements Converter<RouteTypeCommand, RouteType>{
    @Synchronized
    @Nullable
    @Override
    public RouteType convert(RouteTypeCommand source) {
        if (source == null) {
            return null;
        }
        final RouteType type = new RouteType();
        type.setId(source.getId());
        type.setName(source.getName());
        return type;
    }
}
