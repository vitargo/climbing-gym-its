package edu.gym.climbing.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String comment;
    @OneToOne
    private Complexity complexity;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "climber_id")
    private Climber author;
    @OneToOne
    private Event event;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gym_id")
    private Gym gym;
    private String imageUrl;
    private boolean isArchive;
    @OneToOne
    private RouteType type;
    @OneToOne
    private Level level;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sector_id")
    private Sector sector;
    private Date date;
}
