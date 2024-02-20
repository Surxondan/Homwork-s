package Liskov_Substitution;

import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println("🚗 🚗 🚗 🚗  Mashina  🚕 🚕 🚕  🚕 ");
        car.start();
        car.stop();
        car.yoqulgi();
        System.out.println("🚲 🚲 🚲 🚲 🚲 Velosiped🚲 🚲 🚲 🚲 🚲 🚲  ");
        Bike bike=new Bike();
        bike.start();
        bike.stop();
    }
}
