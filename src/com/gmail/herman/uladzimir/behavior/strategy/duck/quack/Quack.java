package com.gmail.herman.uladzimir.behavior.strategy.duck.quack;

import com.gmail.herman.uladzimir.behavior.strategy.duck.QuackBehavior;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack!");
    }

}
