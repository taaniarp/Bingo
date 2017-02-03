package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class GameState {

    private Integer numeroJugador1;
    private Integer numeroJugador2;

    //inicializa los num de los jugadores de manera aleatoria
    public void initPlayerNumbers(){

        this.numeroJugador1 = ThreadLocalRandom.current().nextInt(0, 10);

        while (true) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 10);

            if (randomNum != numeroJugador1){
                this.numeroJugador2 = randomNum;
                return;
            }
        }
    }


    public int checkNumber(int num) {

        if (numeroJugador1 == num){
            return 1;
        }
        else if(numeroJugador2 == num){
            return 2;
        }
        else {
            return 0;
        }
    }

    public int getPlayer1Num(){
        return numeroJugador1;
    }

    public int getPlayer2Num(){
        return numeroJugador2;
    }
}
