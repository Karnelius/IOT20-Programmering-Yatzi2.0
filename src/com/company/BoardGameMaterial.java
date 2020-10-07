package com.company;

public class BoardGameMaterial {
    /* Will be used to store all boardgamematerials in one class */
}

class Die {

    public int value;

    public Die() {
        value = (int) Math.random();
    }

    public int DieRoll() {
        value = (int)(Math.random()*6+1);
        return value;

    }

    public String getString() {
        return "Dice shows " + value;
    }
}