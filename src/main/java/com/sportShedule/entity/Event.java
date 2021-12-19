package com.sportShedule.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

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
    private String imageBase64;

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

}
