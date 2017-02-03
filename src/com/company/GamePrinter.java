package com.company;

import java.io.IOException;
import java.util.Scanner;

public class GamePrinter {

    public static String readName(int playerNum){

        Scanner scanner = new Scanner(System.in);

        if (playerNum == 1){
            System.out.println("Player1 enter your name.");
            return scanner.nextLine();
        }
        if (playerNum == 2){
            System.out.println("Player2 enter your name.");
            return scanner.nextLine();
        }
        return null;
    }

    public static void printPlayerNumbers(GameState game, Player player1, Player player2){

        System.out.println(player1.getName() + " the number you're gonna play with is: " + game.getPlayer1Num());
        System.out.println(player2.getName() + " the number you're gonna play with is: " + game.getPlayer2Num());

    }

    public static void printNumber (Integer num){

        System.out.println("The number is: " + num);
        System.out.println("Press enter key to continue.");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printWinner (Integer playerNumber, Player player1, Player player2){

        if (playerNumber == 1){
            System.out.println("The Winner is " + player1.getName());
        }else {
            System.out.println("The winner is " + player2.getName());
        }

    }
}
