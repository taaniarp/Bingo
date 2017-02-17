package com.company;

import java.util.Scanner;

public class GameRunner {

    private GameState game;
    private Player player1;
    private Player player2;
    private BallBlower ballBlower;

    Scanner scanner = new Scanner(System.in);



    public void run(){

        game = new GameState();
        ballBlower = new BallBlower();

        String player1Name = GamePrinter.readName(1);
        String player2Name = GamePrinter.readName(2);

        player1 = new Player(player1Name,1);
        player2 = new Player(player2Name,2);

        GamePrinter.printPlayerNumbers(game, player1 , player2);

        while (!game.isOver()){

            int num = ballBlower.deliveredNumber();
            game.checkNumber(num);
            GamePrinter.printNumber(num);
            GamePrinter.printMove(game, player1, player2);


        }

        GamePrinter.printWinner(game.getWinner(), player1, player2);

    }
}
