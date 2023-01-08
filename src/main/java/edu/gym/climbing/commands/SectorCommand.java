package edu.gym.climbing.commands;

import edu.gym.climbing.model.Gym;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
public class SectorCommand {
    private long id;
    private Gym gym;
    private String name;
    private Date date;
}
