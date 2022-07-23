package com.gmail.herman.uladzimir.behavior.strategy.duck.bird;

import com.gmail.herman.uladzimir.behavior.strategy.duck.fly.FlyWithWings;
import com.gmail.herman.uladzimir.behavior.strategy.duck.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck!");
    }

}
