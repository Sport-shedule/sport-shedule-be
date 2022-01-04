package com.sportShedule.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="EVENT")
@Data
public class Event {

    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date date;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="firstPlayer")
    private Player firstPlayer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="secondPlayer")
    private Player secondPlayer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "scoreId")
    private Score score;

    @Column(name="categoryId")
    private Long categoryId;

    @ElementCollection
    @CollectionTable(name="images")
    @Column(name = "imageBase64", length = 200000)
    private List<String> images;
}
