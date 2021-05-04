package com.aldeamo.bartender.dto;

import lombok.Builder;
import lombok.Data;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Data
@Builder
public class ResBartender {

    private boolean success;
    private String description;
    private int iterations;
    Pila pila;
    ArrayList<Integer> result;

}
