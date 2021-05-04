package com.aldeamo.bartender.util;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Numbers {

    public static ArrayList<Integer> getPrimeNumbers(){

        ArrayList<Integer> numList = new ArrayList<Integer>();

        for (int num=2;num<=100;num++)
        {
            boolean isprime = isPrime(num);

            if(isprime){
                numList.add(num);
            }

        }

        return numList;

    }

   public static boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static boolean isDivisible(int a, int b){

       return (Math.floorDiv(a, b) % 2) == 0;

    }

}
