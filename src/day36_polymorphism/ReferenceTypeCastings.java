package day36_polymorphism;

import day26_statics.IPhone;
import day29_inheritance.animalTask.*;
import day30_inheritance.phoneTask.Iphone;
import day30_inheritance.phoneTask.Nokia;
import day30_inheritance.phoneTask.Phone;
import day33_abstraction.employeeTask.*;
import day35_polymorphism.transportationTask.AutoPilot;
import day35_polymorphism.transportationTask.Electric;
import day35_polymorphism.transportationTask.Tesla;


public class ReferenceTypeCastings {
    public static void main(String[] args) {

        Dog dog = new Dog();

        //Cat cat=new  Dog();

        Animal animal = (Animal) new Dog();//implicit casting--upcasting
        System.out.println("-----------------------");

        Animal animal1 = new Dog();
        animal1.setInfo("Max", "Husky", 'M', 4, "Large", "White");
        animal1.eat();
        animal1.drink();
        animal1.sleep();
        //animal1.bark();-- we do not have this method in the reference type
        ((Dog) animal1).bark();//we can call the features of the object type//down casting
        //Dog dog1=(Dog)animal1;//down casting--there must be  is a relationship
        //dog.bark();


        //( (Cat)animal1).scratch();//Dog cannot be converted to Cat, because there is no "is a" relationship btw dog and cat.
        //That's why, we get ClassCastExceptionError


        Phone phone = new Nokia("Brick", "Small", 50, "Pink");
        phone.call(911);
        ((Nokia) phone).selfDefense();

        //((Iphone)phone).faceTime();//Nokia cannot be converted to Iphone,because there is no "IS A" relationship

        System.out.println("---------------------------------");


        Employee employee = new Developer("Lucy", 35, 'F', "C1", "Java Developer", 95000, "Java");
        employee.work();
        System.out.println(((Developer) employee).getProgrammingLanguage());

        //Tester tester=(Tester)employee;//ClassCastException. (because we have the developer object)

        Electric electric = new Tesla("Tesla", "Model Y", "Blue", 2020, 55000);


       /* Tesla tesla=(Tesla)electric;
        tesla.autoPark();*/

     ((Tesla )electric).autoPark();
      ((AutoPilot) electric).selfDrive();//we could be able to reach the selfDrive method because AutoPilot interface and tesla has  is a relationship

        System.out.println("--------------------------------");

        Employee employee1= new Teacher("James", 45, 'M', "b1", "Math Teacher", 750000);
        Employee employee2= new Developer("Lucy", 35, 'F', "C1", "Java Developer", 95000, "Java");
        Employee employee3 = new Driver("Aaron", 48, 'M', "D1", "Truck driver", 90000);
        Employee employee4= new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);


        employee1.work();//the reference type decides which features to reach, the implementation is done as in the object type.
        employee2.work();
        employee3.work();
        employee4.work();



















    }


}
