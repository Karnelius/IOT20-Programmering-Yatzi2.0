package com.company;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static com.company.Main.flagIfYatzi;
import static com.company.Die.*;
import static com.company.Main.*;
import static org.junit.Assert.*;


public class YatziTest {



    @DisplayName("Se att den skriver ut Yatzi när man får alla rätt?")
    @Test
    void isYatziWhenAllDiceMatches() {
        Die[] dice = new Die[5];
        dice[0] = new Die(1);
        dice[1] = new Die(1);
        dice[2] = new Die(1);
        dice[3] = new Die(1);
        dice[4] = new Die(1);
        assertTrue((Main.flagIfYatzi(dice)));
    }




    @DisplayName("Fortsätter när man inte får 5 matchande dices?")
    @Test
    public boolean isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Die[] dice = new Die[5];
        for (int i = 0; i < dice.length; i++) {
            Die die = dice[i];
            die.value = 6;
        }
        dice[5].value = 1;
        Assertions.assertNotEquals(flagIfYatzi(dice));
        return false;
    }

}