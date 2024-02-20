package Liskov_Substitution;

public class Car implements Transport,Bak{
    @Override
    public void yoqulgi() {
        System.out.println("Yoqilg`i da yuradi");
    }

    @Override
    public void start() {
        System.out.println(" car starting");
    }

    @Override
    public void stop() {
        System.out.println("car stoping");
    }
}
