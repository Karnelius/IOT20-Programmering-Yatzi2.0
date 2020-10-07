package com.company;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

public class YatziTest {
    @DisplayName("Se att den skriver ut Yatzi när man får alla rätt?")
    @Test
    void isYatziWhenAllDiceMatches() {
        Die[] dice = new Die[5];
        for(Die die: dice) {
            die.value = 6;
        }
        //Assert something?
    }
    @DisplayName("Fortsätter när man inte får 5 matchande dices?")
    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Die[] dice = new Die[5];
        for(Die die: dice) {
            die.value = 6;
        }
        dice[5].value = 1;
        //Assert something?
    }
}