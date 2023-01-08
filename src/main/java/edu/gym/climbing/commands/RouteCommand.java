package edu.gym.climbing.commands;

import edu.gym.climbing.model.Climber;
import edu.gym.climbing.model.Event;
import edu.gym.climbing.model.Gym;
import edu.gym.climbing.model.Sector;
import edu.gym.climbing.model.Complexity;
import edu.gym.climbing.model.Level;
import edu.gym.climbing.model.RouteType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
public class RouteCommand {
    private long id;
    private String name;
    private String comment;
    private Complexity complexity;
    private Climber author;
    private Event event;
    private Gym gym;
    private String imageUrl;
    private boolean isArchive;
    private RouteType type;
    private Level level;
    private Sector sector;
    private Date date;
}
