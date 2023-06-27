package day29_inheritance.animalTask;

public class Dog extends Animal {//dog is an animal
    //even though it seems empty, everything from the animal class have been inherited to the dog class.

   /* public void method(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);

        setInfo();
        eat();
        drink();
        sleep();
        toString()


    }*/

public void bark(){
    System.out.println(getName()+" is barking");
}




}
