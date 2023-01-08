package edu.gym.climbing.commands;

import edu.gym.climbing.model.Gym;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
public class EventCommand {
    private long id;
    private String name;
    private String address;
    private String description;
    private Date dateFrom;
    private Date dateTill;
    private String image;
    private String price;
    private Gym gym;
}
