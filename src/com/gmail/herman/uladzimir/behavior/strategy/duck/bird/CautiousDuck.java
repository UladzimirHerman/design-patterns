package com.gmail.herman.uladzimir.behavior.strategy.duck.bird;

import com.gmail.herman.uladzimir.behavior.strategy.duck.fly.FlyWithWings;
import com.gmail.herman.uladzimir.behavior.strategy.duck.quack.MuteQuack;

public class CautiousDuck extends Duck {

    public CautiousDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a really cautious duck. You can't catch me =P");
    }

}
