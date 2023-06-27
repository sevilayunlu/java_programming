package day29_inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.setInfo("Max","Husky",'M',4,"Large","White");//this setInfo method comes from the dog class
        Cat cat1 = new Cat();
        cat1.setInfo("Felicia","Stray",'F',3,"Medium","Black and White");//cat class has also its own setInfo method
        Tiger tiger=new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',5,"Large","Orange");

        System.out.println(dog1);
        System.out.println(cat1);
        System.out.println(tiger);

        System.out.println("------------------------------------------");

        dog1.eat();//these methods come from the dog class.The methods have been inherited.
        dog1.sleep();
        dog1.drink();

        cat1.eat();
        cat1.sleep();
        cat1.drink();

        tiger.eat();
        tiger.sleep();
        tiger.drink();


        System.out.println("------------------------------------------");

        dog1.bark();
       // cat1.bark()
        System.out.println("-----------------------------------");

        System.out.println(dog1.getName());
        System.out.println(dog1.getColor());

        dog1.setGender('F');
        dog1.setAge(5);;
        System.out.println(dog1);



    }
}
