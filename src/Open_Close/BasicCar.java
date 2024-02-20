package Open_Close;

public class BasicCar implements Car {
    @Override
    public String getDescription() {
        return "Basic Car";
    }

    @Override
    public double getPrice() {
        return 10000;
    }
}
