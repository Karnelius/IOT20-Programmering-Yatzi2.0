package com.company;

class Die {

    public int value;

    public Die() {
        value = (int) Math.random();
    }

    public int DieRoll() {
        value = (int) (Math.random() * 2 + 1);
        return value;

    }
    public Die(int i){
        value = i;
    }
}

//överskuggning DIe / DIe (int i)