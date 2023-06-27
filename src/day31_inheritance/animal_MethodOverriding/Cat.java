package day31_inheritance.animal_MethodOverriding;

public class Cat extends Animal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Cat "+getName()+" is eating cat food");
    }


    @Override
    public void sleep() {
        System.out.println("Cat "+getName()+" sleeps 12 hours in a day");
    }

//@Override this method is not an overridden method
// because we did not inherit it from the parent class.
// It is the unique method of the cat class.
    public void scratch(){
        System.out.println("Cat "+getName()+" is scratching");
    }
}
