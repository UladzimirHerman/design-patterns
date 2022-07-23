package com.gmail.herman.uladzimir.behavior.strategy.duck.fly;

import com.gmail.herman.uladzimir.behavior.strategy.duck.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying on the rocket like a boss! Ho-ho-ho!");
    }

}
