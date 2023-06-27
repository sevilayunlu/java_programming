package day34_abstraction.carTask;

public abstract class Car {//meant to br inherited and cannot be instantiated

    private final String make;//final variables do not have any default value. That's why, it will be giving compile error until we create the constructor and initialize them.
    private final String model;
    private String color;
    private final int year;
    private double price;

    public Car(String model, String color, int year, double price) {
        this.make = getClass().getSimpleName();//to set the class name to the make of the car
        this.model = model;
        this.color = color;
        if (year < 1886) {
            System.err.println("Invalid year: " + year);
            System.exit(1);
        }
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            System.err.println("Invalid price: " + price);
            System.exit(1);
        }
        this.price = price;
    }

   protected final void stop(){//to make sure that the non subclasses outside the class cannot access it.
        System.out.println("Press the brake to stop "+make+" "+model);
    }

    protected abstract void start();//meant to be overridden

    @Override
    public String toString() {
        return make+ "{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
}
/* Create an abstract class named Car
        variables:
        make (final), model (final), color, year (final), price

        Encapsulate all the fields
        Conditions:
        1. year can not be less than 1886
        2. price can not be less than negative or zero

        Add a constructor that can set all the fields
        Note: Class name can be set to the make of the car

        Methods:
        stop() (final): prints "Press the brake"

        start() (abstract)

        toString(): prints the given car info when a car object is passed in the print statement

        2. Create the following subclasses of Car
        1. Honda
        2. Audi
        extra methods:
        autoPark()
        3. Tesla
        extra methods:
        autoPilot()   */