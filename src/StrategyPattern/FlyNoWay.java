package StrategyPattern;

public class FlyNoWay implements FlyBehaviour{
    public void fly() {
        System.out.println("Does not fly");
    }
}
