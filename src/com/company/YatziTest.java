package com.company;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static com.company.Main.flagIfYatzi;
import static com.company.Die.*;
import static com.company.Main.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class YatziTest {



    @DisplayName("Se att den skriver ut Yatzi när man får alla rätt?")
    @Test
    void isYatziWhenAllDiceMatches() {
        Die[] dice = new Die[5];                //Är en ny tärning.
        for (Die die : dice) die.value = 6;
    }

    /*

    public void evenNumberTest(){
        MyAssertFalseTest asft = new MyAssertFalseTest();
        assertFalse(asft.isEvenNumber(3));;

     */



    @DisplayName("Fortsätter när man inte får 5 matchande dices?")
    @Test
    void isNotYatziWhenOneDieIsNotMatchingTheOther() {
        Die[] dice = new Die[5];
        for(Die die: dice) {
            die.value = 6;
        }
        dice[5].value = 1;
        Assertions.assertTrue(flagIfYatzi());

    }


}