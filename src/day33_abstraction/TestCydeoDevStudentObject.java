package day33_abstraction;

import java.time.LocalDate;

public class TestCydeoDevStudentObject {

    public static void main(String[] args) {

        CydeoDevStudent student1=new CydeoDevStudent("Daniel", 'M', LocalDate.of(2000,11,1),"A1", "Zero to Hero",3);
        System.out.println(student1);

        student1.eat();
        student1.drink();
        student1.sleep();
        student1.breath();




    }
}
