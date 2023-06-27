package day32_finalKeyword.personTask;

import java.rmi.ServerError;
import java.time.LocalDate;

public class Person {

    private String name;
    private final char gender;//when we write final keyword it gives compile error
    // because there is no default value for the final reference of the variable,
    // so we have to initialize it before we use it.

    private final int age;
    private final LocalDate dateOfBirth;


    public static final int numberOfHead;


    static {
        numberOfHead = 1;
    }

    public Person(String name, char gender, LocalDate dateOfBirth) {//because we do not have any setters we have to give conditions to set them in the constructor.
        //only the constructor can set the variables with final keyword
        setName(name);
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("Invalid gender: " + gender);
            System.exit(1);
        }
        this.gender = gender;

        this.dateOfBirth = dateOfBirth;


        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }


    /*public void setGender(char gender){--if the instance variable is final, we can only generate getter for it.
        this.gender=gender;
    }*/


    public void eat() {
        System.out.println(name + " is eating");

    }

    public void drink() {
        System.out.println(name + " is drinking");

    }

    public void sleep() {
        System.out.println(name + " is sleeping");

    }

    public final void breath() {//to make sure that this implementation will not change for any subclass
        System.out.println(name + " is breathing");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
/*
variables:
name,age,dateOfBirth
numberOfHead

Methods:
eat(), drink(),sleep()
breath()
*/
