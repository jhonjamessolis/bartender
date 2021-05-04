package com.aldeamo.bartender.component;

import com.aldeamo.bartender.dto.Pila;

import com.aldeamo.bartender.util.Numbers;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

@Component
public class BartenderComponent {

     ArrayList<Integer> pilaA = new ArrayList<Integer>();
     ArrayList<Integer> pilaB = new ArrayList<Integer>();
     ArrayList<Integer> pilaP = Numbers.getPrimeNumbers();

        public ArrayList<Integer> executePila(Pila pila, int iter){

            pilaA.clear();
            pilaB.clear();

            for (int i = 0; i < iter; i++) {

                if(i<1){
                    pilaA = this.getArrayPilaA(pila);
                }
                this.iteratorPila(pilaA, pilaP);

            }

           return pilaB;

        }


    public void iteratorPila(ArrayList<Integer> pilaA, ArrayList<Integer> pilaP) {

        ArrayList<Integer> pilaAtmp = new ArrayList<Integer>();

        ListIterator iterA = pilaA.listIterator(pilaA.size());
        int iterP = 0;

        while (iterA.hasPrevious()){

            int numA = iterA.previous().hashCode();
            int numP = pilaP.get(iterP);

            if (Numbers.isDivisible(numA, numP)){
                pilaB.add(numA);
            } else{
                pilaAtmp.add(numA);
            }

            iterP++;
        }

        pilaA.clear();
        pilaA.addAll(pilaAtmp);

    }

    public ArrayList<Integer> getArrayPilaA(Pila pila){

        String[] splitString = pila.getInputArray().split(",");
        List<String> listString = new ArrayList<>(Arrays.asList(splitString));

        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i=0;i<listString.size();i++) {

            list.add(Integer.parseInt(listString.get(i)));
        }
        return list;

    }
}
