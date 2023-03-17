package day18_02_2023;

import java.util.Random;

public class Computer {
    public static void main(String[] args) {

    }
    public Move getMove () {
       Move[] moves = Move.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }
}
