package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


public class YatziTest {

    @DisplayName("Checks if you get Yatzi when all the dices are the same")
    @Test
    void isYatziWhenAllDiceMatches() {
        Die[] dice = new Die[5];
        dice[0] = new Die(1);
        dice[1] = new Die(1);
        dice[2] = new Die(1);
        dice[3] = new Die(1);
        dice[4] = new Die(1);
        assertTrue((Main.isYatzi(dice)));
    }

    @DisplayName("Checks if you don't get Yatzi when all the dices are not the same")
    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Die[] dice = new Die[5];
        dice[0] = new Die(1);
        dice[1] = new Die(2);
        dice[2] = new Die(3);
        dice[3] = new Die(4);
        dice[4] = new Die(5);

        assertFalse(Main.isYatzi(dice));
    }
}