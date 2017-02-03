package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BallBlower {

    private List <Integer> deliveredNumbers = new ArrayList<>();

    public Integer entregarNum(){

        while (true) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 10);

            if (!deliveredNumbers.contains(randomNum)){
                deliveredNumbers.add(randomNum);
                return randomNum;
            }
        }
    }

    public boolean numbersLeft(){

        for (int i = 0; i <10 ; i++) {
            if (!deliveredNumbers.contains(i)){
                return true;
            }
        }
        return false;
    }
}
