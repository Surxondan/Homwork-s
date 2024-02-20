package Liskov_Substitution;

public class Bike implements Transport{


    @Override
    public void start() {
        System.out.println("Bike starting ");
    }

    @Override
    public void stop() {
        System.out.println("Bike stoping");
    }
}
