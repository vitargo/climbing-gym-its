package edu.gym.climbing.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Gym {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToOne
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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gym")
    @ToString.Exclude
    private Set<Event> events = new HashSet<>();

    @Builder
    public Gym(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
