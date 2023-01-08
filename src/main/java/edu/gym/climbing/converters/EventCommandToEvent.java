package edu.gym.climbing.converters;

import edu.gym.climbing.commands.EventCommand;
import edu.gym.climbing.model.Event;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EventCommandToEvent implements Converter<EventCommand, Event> {
    @Override
    public Event convert(EventCommand source) {
        return null;
    }
}
