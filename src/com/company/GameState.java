package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class GameState {

    private Integer player1Number;
    private Integer player2Number;

    public GameState() {
        initPlayerNumbers();
    }

    //Starts the numbers of the players randomly
    public void initPlayerNumbers(){

        this.player1Number = ThreadLocalRandom.current().nextInt(0, 10);

        while (true) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 10);

            if (randomNum != player1Number){
                this.player2Number = randomNum;
                return;
            }
        }
    }


    public int checkNumber(int num) {

        if (player1Number == num){
            return 1;
        }
        else if(player2Number == num){
            return 2;
        }
        else {
            return 0;
        }
    }

    public int getPlayer1Num(){
        return player1Number;
    }

    public int getPlayer2Num(){
        return player2Number;
    }
}
