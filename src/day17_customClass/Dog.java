package day17_customClass;

public class Dog {

    public String name;//instance variable
    public String breed;
    public char gender;
    public int age;
    public String size;
    public String color;

    public void setInfo(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

//this method can help us to set all information of the dog at once.

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void drink() {
        System.out.println(name + " is drinking water");
    }


    public String toString() {//to avoid getting a hashCode when we print the class objects
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
