package com.company;

public class GameState {
    
    private Line linePlayer1;
    private Line linePlayer2;

    public GameState() {
        initPlayerLines();
    }

    //Starts the numbers of the players randomly
    public void initPlayerLines(){

        this.linePlayer1 = new Line();

        while (true) {
            this.linePlayer2 = new Line();
            if (!linePlayer1.equals(linePlayer2)){
               break;
            }
        }
    }

    public void checkNumber(int num) {

        if (linePlayer1.checkNumber(num)){
        }
        if(linePlayer2.checkNumber(num)){
        }
    }

    public boolean isOver() {
        if (linePlayer1.lineCompleted() || linePlayer2.lineCompleted()){
            return true;
        }
        else {
            return false;
        }
    }

    public Integer getWinner(){
        if (linePlayer1.lineCompleted()){
            return 1;
        }
        else if (linePlayer2.lineCompleted()){
            return 2;
        }
        else {
            return 0;
        }
    }

    public Line getLinePlayer1() {return linePlayer1;}

    public Line getLinePlayer2() {
        return linePlayer2;
    }
}
