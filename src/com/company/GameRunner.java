package com.company;

import java.util.Scanner;

public class GameRunner {

    private GameState game;
    private Jugador player1;
    private Jugador player2;
    private Bombo bombo;

    Scanner scanner = new Scanner(System.in);



    public void run(){

        game = new GameState();
        bombo = new Bombo();

        game.initPlayerNumbers();

        player1 = new Jugador("Tania");
        player2 = new Jugador("Alvaro");

        System.out.println("Player 1 " + player1.getNombre() + " the number you're gonna play with is: " + game.getPlayer1Num());
        System.out.println("Player 2 " + player2.getNombre() + " the number you're gonna play with is: " + game.getPlayer2Num());

        int result = 0;

        while (result == 0){

            int num = bombo.entregarNum();
            result = game.checkNumber(num);

            System.out.println("The number is: " + num);

        }

        if (result == 1){
            System.out.println("The Winner is " + player1.getNombre());
        }else {
            System.out.println("The winner is " + player2.getNombre());
        }


    }
}
