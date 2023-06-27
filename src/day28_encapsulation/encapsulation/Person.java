package day28_encapsulation.encapsulation;

import java.time.LocalDate;

public class Person {
    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    public String getName() {
        if (name == null) {
            System.out.println("Unknown");
        }

        return name;
    }

    public void setName(String name) {

        if (name == null || name.isBlank() || name.isBlank()) {
            System.out.println("Invalid name: " + name);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0 || age > 120) {
            System.out.println("Invalid age: " + age);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (gender != 'F' || gender != 'M') {
            System.out.println("Invalid gender: " + gender);
        }
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {

        if (dateOfBirth.isAfter(LocalDate.now())) {
            System.out.println("Invalid date: " + dateOfBirth);
        }
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }


    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge()+
                ", gender=" + getGender() +
                ", dateOfBirth=" + getDateOfBirth() +
                '}';
    }
}
/*



Variables: name,age,gender,dateOfBirth

name:
Write:cannot be null/empty/blank
Read:if name is not,return "Unknown" instead
age:
Write:age cannot be less than zero or greater than 120

gender:
Write: gender can only be 'M' or 'F'

dateOfBirth:
Write: cannot be after today`s date

Add a constructor that can set all the fields
Add toString()


 */