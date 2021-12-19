package com.sportShedule.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PLAYER")
@Data
public class Player {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
}
