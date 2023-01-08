package edu.gym.climbing.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Climber {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @OneToOne
    private Level level;
    private boolean isAdmin;
    @OneToOne
    private Country country;
    private String city;
    private Date birthday;
    private int weight;
    private String latitude;
    private String longitude;

}





