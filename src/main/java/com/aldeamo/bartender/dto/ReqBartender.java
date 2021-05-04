package com.aldeamo.bartender.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReqBartender {

    private int iteracciones;
    private int IdPila;

}
