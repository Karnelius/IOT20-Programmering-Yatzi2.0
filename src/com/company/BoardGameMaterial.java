package com.company;



class Die {

    public int value;

    public Die() {
        value = (int) Math.random();
    }

    public int DieRoll() {
        value = (int) (Math.random() * 6 + 1);
        return value;

    }

    public String diceString() {
        return "Dice shows " + value;
    }
}