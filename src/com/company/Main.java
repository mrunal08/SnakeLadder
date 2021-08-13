package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Program");

        //UC2
        int dice;
        Random diceroll = new Random();
        dice = diceroll.nextInt(6);
        System.out.println("Dice Rolled : "+dice);
    }
}
