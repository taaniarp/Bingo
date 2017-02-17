package com.company;

public class Player {

    private String name;
    private int number;

    public Player(String name, int num) {
        this.name = name;
        this.number = num;
    }

    public String getName() {
        return name;
    }
    public int getNumber(){ return number;}

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", number= " +number+
                '}';
    }
}
