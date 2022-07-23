package com.gmail.herman.uladzimir.behavior.strategy.duck.bird;

import com.gmail.herman.uladzimir.behavior.strategy.duck.FlyBehavior;
import com.gmail.herman.uladzimir.behavior.strategy.duck.QuackBehavior;

public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public abstract void display();

    public void swim() {
        System.out.println("All ducks can swim!");
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

}
