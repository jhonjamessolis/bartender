package com.aldeamo.bartender.service;

import com.aldeamo.bartender.component.BartenderComponent;
import com.aldeamo.bartender.dto.Pila;
import com.aldeamo.bartender.dto.ReqBartender;
import com.aldeamo.bartender.dto.ResBartender;
import com.aldeamo.bartender.repository.PilasRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BartenderServiceImpl implements BartenderService{

    @Autowired private PilasRepository pilasRepository;
    @Autowired private BartenderComponent bartenderComponent;

    public ResBartender getArray(ReqBartender reqBartender){

        Optional<Pila> pila = pilasRepository.findById(reqBartender.getIdPila());
        if(pila.isPresent()){

            ArrayList<Integer> resultPilaExecution = bartenderComponent.executePila(pila.get(), reqBartender
            .getIteracciones());

            return ResBartender.builder()
                    .success(true)
                    .description("Pila ejecutada con éxito.")
                    .iterations(reqBartender.getIteracciones())
                    .pila(pila.get())
                    .result(resultPilaExecution)
                    .build();

        } else{

            return ResBartender.builder().success(false).description("Pila no encontrada.").build();
        }

    }
}
