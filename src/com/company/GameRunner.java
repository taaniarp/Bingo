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

        player1 = new Player(player1Name);
        player2 = new Player(player2Name);

        GamePrinter.printPlayerNumbers(game, player1 , player2);

        int result = 0;

        while (result == 0){

            int num = ballBlower.deliveredNumbers();
            result = game.checkNumber(num);

            GamePrinter.printNumber(num);

        }

        GamePrinter.printWinner(result, player1, player2);

    }
}
