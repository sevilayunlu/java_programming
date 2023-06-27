package day35_polymorphism;

import day31_inheritance.shape_methodOverriding.Circle;
import day33_abstraction.employeeTask.*;
import day34_abstraction.animalTask.*;
import day34_abstraction.carTask.Audi;
import day34_abstraction.carTask.Honda;
import day34_abstraction.carTask.Tesla;

import java.util.Arrays;


public class PolymorphismIntro {

    public static void main(String[] args) {

        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");
        Cat cat = new Cat("Max", "Husky", 'M', 4, "Small", "White");
        Tiger tiger = null;
        Eagle eagle = null;
        Lion lion = null;
        Parrot parrot = null;
        Dolphin dolphin = null;
        Shark shark = null;
        Duck duck = null;

        Animal[] animals = {dog, cat, tiger, lion, parrot, dolphin, shark, duck};//polymorphism.

        Animal animal = new Dog("Max", "Husky", 'M', 3, "Large", "White");
        animal.eat();//calls the method from the Dog object if it is overridden.
        animal.drink();
        animal.sleep();

        // animal.bark();//only the variables and methods in the reference type can be accessed.
        // If the object has some unique methods , we cannot reach them thorough polymorphism
        // and that is a disadvantage.
        // animal.play();


        String s = "Java";
        Integer i = 100;
        Double d = 20.3;
        Boolean r = true;
        Circle circle = new Circle(3.5);
        Honda honda = new Honda("Pilot", "Black", 2019, 35000);
        Audi audi = new Audi("Q6", "Silver", 2020, 36000);
        Tesla tesla = new Tesla("Model Y", "Blue", 2022, 60000);

        Object[] objects = {s, i, d, r, circle, honda, audi, tesla};


        System.out.println(Arrays.toString(objects));


        Teacher teacher = new Teacher("James", 45, 'M', "b1", "Math Teacher", 750000);
        Developer developer = new Developer("Lucy", 35, 'F', "C1", "Java Developer", 95000, "Java");
        Driver driver = new Driver("Aaron", 48, 'M', "D1", "Truck driver", 90000);
        Tester tester = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);

        Employee[] employee = {teacher, developer, driver, tester};


        Employee obj = new Developer("Lucy", 35, 'F', "C1", "Java Developer", 95000, "Java");

        obj.work();//it calls the object type version of the work method.(it comes from developer class) While creating the object,
        // to use  a specific reference type would be useful to be able to reach for the methods in this specific reference

        System.out.println("---------------------------------------");
        Tesla car1 = new Tesla("Model Y", "Whie", 2020, 55000);
        car1.start();
        car1.autoPilot();



    }

}
