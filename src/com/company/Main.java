package com.company;
import java.util.Scanner;
public class Main {
    public static Die[] dice;
    public static boolean gameIsOn = true;
    public static int rollingTurn = 0;

    public static void main(String[] args) {
        theDice();
        welcomeMessage();
        while (gameIsOn) {
            while (rollingTurn < 3) {
               gamePlay();
                if (flagIfYatzi()) {
                    System.out.println("You got YATZI! in " + dice[0].value + "'s");
                    return;
                } else {
                    if (rollingTurn != 2) {
                        wantToContinueToPlayYesOrNo();
                        break;
                    }
                    gameOver();
                    break;
                } } } }



    private static boolean gameOver() {
        System.out.println("Game over! Want to play again?");
        playerInputToPlay(rollingTurn = 0);
        return false;
    }

    private static boolean gamePlay() {
        System.out.println("Starting turn " + (rollingTurn + 1) + " of 3, rolling dice.");
        for (int i = 0; i < dice.length; i++) {
            dice[i].DieRoll();
            System.out.println(i + 1 + ": Dice shows: " + dice[i].value);
        }
        return true;
    }

    public static void wantToContinueToPlayYesOrNo() {
        System.out.println("Want to throw again? (y for yes, anything else for no)");
        playerInputToPlay(rollingTurn++);
    }
    static void playerInputToPlay(int i) {
        Scanner sc = new Scanner(System.in);
        if ("y".equals(sc.next())) {
        } else {
            gameIsOn = !gameIsOn;
        }
    }

    static void welcomeMessage() {
        System.out.println("Welcome to Yatzi");
    }

    static boolean flagIfYatzi() {
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
        }}}
