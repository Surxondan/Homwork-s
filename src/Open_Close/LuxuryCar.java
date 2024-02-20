package Open_Close;

 public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription() + ", Luxury ";
    }

    @Override
    public double getPrice() {
        return decoratedCar.getPrice() + 5000;
    }
}

