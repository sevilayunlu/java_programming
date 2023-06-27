package day35_polymorphism.transportationTask;

import day34_abstraction.animalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable {
    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }


    public void land(){
        System.out.println("Plane "+getMake()+" "+getModel()+" is landing");
    }

    @Override
    public void fly() {//we have implemented Flyable interface and override the method.
        System.out.println(getMake()+""+getModel()+" is flying");
    }//when we implement the method, that means all the child classes of plane will have the same implementation






}
