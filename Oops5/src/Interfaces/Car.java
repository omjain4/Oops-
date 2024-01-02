package Interfaces;

public class Car implements Engine, Brake, Media{
    @Override
    public void brake() {
        System.out.println("I brake hehe ");
    }

    @Override
    public void start() {
        System.out.println("I start hehe");
    }

    @Override
    public void stop() {
        System.out.println("I stop hehe ");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate hehe");
    }
}
