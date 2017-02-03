package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Bombo {

    private List <Integer> numerosEntregados = new ArrayList<>();

    public Integer entregarNum(){

        while (true) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 10);

            if (!numerosEntregados.contains(randomNum)){
                numerosEntregados.add(randomNum);
                return randomNum;
            }
        }
    }

    public boolean quedanNum(){

        for (int i = 0; i <10 ; i++) {
            if (!numerosEntregados.contains(i)){
                return true;
            }
        }
        return false;
    }
}
