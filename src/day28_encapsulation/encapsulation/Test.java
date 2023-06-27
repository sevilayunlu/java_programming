package day28_encapsulation.encapsulation;

import day28_encapsulation.encapsulation.Student;

public class Test {

    public static void main(String[] args) {

        Student student=new Student();
        //student.age=-200;//the value is assigned to the variable because we used public ac. modi.


        //System.out.println(student.age);

        student.setAge(25);

        System.out.println(student.getAge());

       // student.name="Aaron";

        student.setName("Aaron");

        System.out.println(student.getName());

    }

}
