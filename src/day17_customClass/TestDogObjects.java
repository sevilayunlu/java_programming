package day17_customClass;

public class TestDogObjects {
    public static void main(String[] args) {

        Dog dog1=new Dog();//datatype needs to be Dog


        dog1.name="Max";
        dog1.breed="Husky";
        dog1.gender='F';
        dog1.age=4;
        dog1.size="Large";
        dog1.color="Gray";

        dog1.eat();

        Dog dog2= new Dog();
        dog2.name="Bella";
        dog2.breed="Golden Retriever";
        dog2.gender='F';
        dog2.age=2;
        dog2.size="Small";
        dog2.color="Orange";



        Dog dog3=new Dog();
        dog3.setInfo("Loki","Chow Chow", 'M',3,"Large","Black");
        Dog dog4= new Dog();
        dog4.setInfo("Chuck","Bullldog",'M',5,"Medium","White");


        System.out.println(dog1);//day17_customClass.Dog@edf4efb(hashcode)//
        // because the method to String is missing.
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);



        dog3.eat();
        dog2.drink();;
    }


}
