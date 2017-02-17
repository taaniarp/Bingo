package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BallBlower {

    private List <Integer> numbers = new ArrayList<>();


    public BallBlower(){
        for (int i = 0; i < 10 ; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
    }

    public Integer deliveredNumber(){

        return numbers.remove(numbers.size()-1);
    }

}
