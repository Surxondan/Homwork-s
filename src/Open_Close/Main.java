package Open_Close;
public class Main {
    public static void main(String[] args) {
        // Basic car
        Car basicCar = new BasicCar();
        System.out.println("Basic Car Description: " + basicCar.getDescription());
        System.out.println("🚗 Basic Car Price: " + basicCar.getPrice()+ "💲💵");

        // Luxury car
        Car luxuryCar = new LuxuryCar(basicCar);
        System.out.println("Luxury Car Description: " + luxuryCar.getDescription() );
        System.out.println("🚘 🚘 🚙 Luxury Car Price: " + luxuryCar.getPrice()+"💲💵💵💵💵");
    }
}
