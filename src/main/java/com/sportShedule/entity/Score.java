package com.sportShedule.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="SCORE")
@Data
public class Score {

    @Id
    @GeneratedValue
    private Long id;
    private Integer scorePlayer1;
    private Integer scorePlayer2;
}
