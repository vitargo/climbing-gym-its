package edu.gym.climbing.commands;

import edu.gym.climbing.model.Country;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GymCommand {
    private long id;
    private String name;
    private Country country;
    private String city;
    private String address;
    private String logoImage;
    private String latitude;
    private String longitude;
    private String description;
    private String fbLink;
    private String instaLink;
    private String youtubeLink;
    private String webLink;
    private String phone;
    private String photo;
    private String map;
    private boolean isArchive;
}
