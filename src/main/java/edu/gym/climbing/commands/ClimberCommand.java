package edu.gym.climbing.commands;

import edu.gym.climbing.model.Country;
import edu.gym.climbing.model.Level;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
public class ClimberCommand {
    private long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String fbId;
    private String fbToken;
    private String email;
    private String avatar;
    private String googleId;
    private String appleId;
    private String password;
    private Level level;
    private boolean isAdmin;
    private Country country;
    private String city;
    private Date birthday;
    private int weight;
    private String latitude;
    private String longitude;
}
