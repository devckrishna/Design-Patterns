package StrategyPattern;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        mallardDuck.setFlyBehaviour(new FlyWithWings());
        mallardDuck.performFly();

        mallardDuck.setQuackBehaviour(new MuteQuack());
        mallardDuck.performQuack();
    }
}
