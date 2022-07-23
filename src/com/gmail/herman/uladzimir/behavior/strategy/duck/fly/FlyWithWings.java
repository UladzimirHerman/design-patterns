package com.gmail.herman.uladzimir.behavior.strategy.duck.fly;

import com.gmail.herman.uladzimir.behavior.strategy.duck.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }

}
