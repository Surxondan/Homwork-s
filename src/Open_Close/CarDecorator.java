package Open_Close;

 public abstract class CarDecorator implements Open_Close.Car {
    protected Open_Close.Car decoratedCar;

    public CarDecorator(Car decoratedCar) {
        this.decoratedCar = decoratedCar;
    }

    @Override
    public String getDescription() {
        return decoratedCar.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedCar.getPrice();
    }
}

