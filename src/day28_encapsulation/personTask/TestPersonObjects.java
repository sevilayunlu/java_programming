package day28_encapsulation.personTask;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person person1=new Person("Mohammed");
        Person person2= new Person("Abidullah",'M');
        Person person3=new Person("Hasan",30);
        Person person4=new Person("Daniel","English");
        Person person5=new Person("Tatiana",25,'F');
        Person person6=new Person("Lucy",31,'F',"English");


        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println(person5);
        System.out.println(person6);//Person{name='Lucy', age=31, gender=F, language='English', planet='Earth'}-planet is static and it is available in each object.


       // person1.planet="Mars";-static variables can also be called by instance objects, but it is not preferred.
        // Person.planet="Mars";//-static variables should be called by the class name.

        Person.printPlanetName();
        person1.eat("Bread");
        person2.drink("Water");
        person5.drink("Tea");









    }
}
