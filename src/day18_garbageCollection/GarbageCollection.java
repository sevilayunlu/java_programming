package day18_garbageCollection;

import day17_customClass.Dog;

public class GarbageCollection {

    public static void main(String[] args) {

        String s1="Java";
        s1=null;//"Java" will be eligible for garbage collection
        System.out.println(s1);

        System.out.println("---------------------------------");

        String a="";//this is an object
        String b=null;//this is nothing, that does not exist

        System.out.println("---------------------------------");
        String str1="Python";
         str1="Cydeo";
        System.out.println(str1);

        System.out.println("---------------------------------");

        Dog dog1=new Dog();
        dog1.setInfo("Loki","Chow Chow", 'M',3,"Large","Black");





        Dog dog2= new Dog();
        dog2.setInfo("Chuck","Bulldog",'M',4,"Medium","White");


       // dog1=null;
        dog1=dog2;
        System.out.println(dog1);
        System.out.println(dog2);

        






    }
}
