package com.company;

import java.util.Scanner;

public class Main {

    public static Die[] dice;
    public static boolean gameIsOn = true;

    public static void main(String[] args) {
        int rollingTurn = 0;
        dice = new Die[5];
        for (int d = 0; d < 5; d++) {
            dice[d] = new Die();
        }

        while (gameIsOn) {
            welcomeMessage();
            while (rollingTurn < 3) {
                System.out.println("Starting turn " + (rollingTurn + 1) + " of 3, rolling dice.");
                for (int i = 0; i < dice.length; i++) {
                    dice[i].DieRoll();
                    System.out.println(i + 1 + ": " + dice[i].diceString());
                }

                boolean flagIfYatzi = true;
                for (int j = 1; j < 5; j++) {
                    if (dice[j].value != dice[j - 1].value) {
                        flagIfYatzi = false;
                    }
                }
                if (flagIfYatzi) {
                    System.out.println("You got YATZI! in " + dice[0].value + "'s");
                    return;
                } else {
                    if (rollingTurn != 2) {
                        System.out.println("Want to throw again? (y for yes, anything else for no)");
                        ContinueToPlay(rollingTurn++);
                            break;
                        }
                    System.out.println("Game over! Want to play again?");
                    ContinueToPlay(rollingTurn=0);
                            break;
                    }
                }
            }
        }


    static void welcomeMessage() {
        System.out.println("Welcome to Yatzi");
    }

 /*   static void continueToPlay() {
        Scanner sc = new Scanner(System.in);
        sc.next().equals("y");

    }*/

    static void ContinueToPlay(int i){
        Scanner sc = new Scanner(System.in);
        if (sc.next().equals("y")) {
        } else {
            gameIsOn = !gameIsOn;
        }

    }
}
