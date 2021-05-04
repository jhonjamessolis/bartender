package com.aldeamo.bartender.dto;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity(name = "pilas")
public class Pila {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "input_array")
    private String inputArray;

    public Integer getId() {
        return id;
    }

    public String getInputArray() {
        return inputArray;
    }
}
