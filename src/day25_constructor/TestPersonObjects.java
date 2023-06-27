package day25_constructor;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {

        Person p1=new Person("Sevilay",'F', LocalDate.of(1990,11,25),true,false);
        Person p2=new Person("Emrah",'M',LocalDate.of(1987,06,10),true,true);
        Person p3=new Person("Alper",'M',LocalDate.of(1993,03,9),false,true);
        Person p4=new Person("Mary",'F',LocalDate.of(1995,3,21),true,false);
        Person p5=new Person("Ali",'M',LocalDate.of(1987,12,5),true,true);

        p1.eat("cake");
        p2.drink("water");
        p3.sleep();




        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);





    }
}
