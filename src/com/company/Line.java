package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Line {

    private List<Integer> numbers = new ArrayList<>();

    public Line() {

        for (int i = 1; i <= 4; i++) {

            while (true) {
                int randomNum = ThreadLocalRandom.current().nextInt(0, 10);

                if (!numbers.contains(randomNum)) {
                    numbers.add(randomNum);
                    break;
                }
            }
        }
    }



    public boolean checkNumber (Integer number){
        if (numbers.contains(number)){
            numbers.remove(number);
            return true;
        }
        return false;
    }

    public boolean lineCompleted() {
        return numbers.isEmpty();

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        return numbers != null ? numbers.equals(line.numbers) : line.numbers == null;
    }

    @Override
    public int hashCode() {
        return numbers != null ? numbers.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Line{" +
                "numbers=" + numbers +
                '}';
    }
}
