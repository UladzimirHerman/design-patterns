package com.gmail.herman.uladzimir.behavior.strategy.duck.fly;

import com.gmail.herman.uladzimir.behavior.strategy.duck.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly :(");
    }

}
