package com.company;
import java.util.Scanner;
public class Main {
    public static Die[] dice;
    public static boolean gameIsOn = true;
    public static int rollingTurn = 0;

    public static void main(String[] args) {
        theDice();
        while (gameIsOn) {
            welcomeMessage();
            while (rollingTurn < 3) {
                turn();
                for (int i = 0; i < dice.length; i++) {
                    dice[i].DieRoll();
                    System.out.println(i + 1 + ": " + dice[i].diceString());
                }
                if (flagIfYatzi()) {
                    System.out.println("You got YATZI! in " + dice[0].value + "'s");
                    return;
                } else {
                    if (rollingTurn != 2) {
                        continueToPlayYesorNo();
                        break;
                    }
                    System.out.println("Game over! Want to play again?");
                    continueToPlay(rollingTurn = 0);
                    break;
                }
            }
        }
    }

    public static void continueToPlayYesorNo() { // added this to row 23.
        int rollingTurn = 0;
        System.out.println("Want to throw again? (y for yes, anything else for no)");
        continueToPlay(rollingTurn++);
    }

    public static void turn() {
        int rollingTurn = 0;
        System.out.println("Starting turn " + (rollingTurn + 1) + " of 3, rolling dice.");
    }

    public static void welcomeMessage() {
        System.out.println("Welcome to Yatzi");
    }
    public static void continueToPlay(int i) {
        Scanner sc = new Scanner(System.in);
        if (sc.next().equals("y")) {
        } else {
            gameIsOn = !gameIsOn;
        }
    }
    public static boolean flagIfYatzi() {
        boolean flagIfYatzi = true;
        for (int j = 1; j < 5; j++) {
            if (dice[j].value != dice[j - 1].value) {
                flagIfYatzi = false;
            }
        }
        return flagIfYatzi;
    }
    public static void theDice() {
        dice = new Die[5];
        for (int d = 0; d < 5; d++) {
            dice[d] = new Die();
        }
    }
}