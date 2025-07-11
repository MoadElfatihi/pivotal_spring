package com.module04.example.ds;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
public class TodoItem {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private String title;
}
