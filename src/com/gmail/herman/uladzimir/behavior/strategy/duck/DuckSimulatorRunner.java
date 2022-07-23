package com.gmail.herman.uladzimir.behavior.strategy.duck;

import com.gmail.herman.uladzimir.behavior.strategy.duck.bird.CautiousDuck;
import com.gmail.herman.uladzimir.behavior.strategy.duck.bird.Duck;
import com.gmail.herman.uladzimir.behavior.strategy.duck.bird.MallardDuck;
import com.gmail.herman.uladzimir.behavior.strategy.duck.bird.ModelDuck;
import com.gmail.herman.uladzimir.behavior.strategy.duck.fly.FlyRocketPowered;

public class DuckSimulatorRunner {

    public static void main(String[] args) {
        actMallardDuck();
        actModelDuck();
        actSuspiciousDuck();
    }

    private static void actMallardDuck() {
        System.out.println("===Mallard Duck output===");
        Duck duck = new MallardDuck();
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
    }

    private static void actModelDuck() {
        System.out.println("===Model Duck output===");
        Duck duck = new ModelDuck();
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
        System.out.println(">>> Switch FlyBehavior");
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
    }

    private static void actSuspiciousDuck() {
        System.out.println("===Cautious Duck output===");
        Duck duck = new CautiousDuck();
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
    }

}
