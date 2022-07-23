package com.gmail.herman.uladzimir.behavior.strategy.duck.bird;

import com.gmail.herman.uladzimir.behavior.strategy.duck.fly.FlyNoWay;
import com.gmail.herman.uladzimir.behavior.strategy.duck.quack.Squeak;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a Model duck!");
    }

}
