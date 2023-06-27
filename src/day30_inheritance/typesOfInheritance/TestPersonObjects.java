package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {

    public static void main(String[] args) {


        Student student = new Student("Lucy", 'F', LocalDate.of(1990, 5, 16), 'A', "A101");
        President president = new President("Daniel", 'M', LocalDate.of(1980, 12, 1), LocalDate.of(2020, 11, 11));
        Teacher teacher = new Teacher("Emily", 'F', LocalDate.of(1985, 11, 1), "Math Teacher", "C1", 98000);


        System.out.println(student);//Student{name='Lucy', age=33, gender=F, DOB=1990-05-16}--to be able to add unique variables in the subclass
        // we need to override the toString method.
        System.out.println(president);
        System.out.println(teacher);


        student.study();
        teacher.teach();
        president.lie();


        System.out.println("--------------------------------");

        student.eat("Kebab");
        teacher.eat("Baklava");
        president.eat("Donut");


        student.drink("Milk");
        teacher.drink("Tea");
        president.drink("Coffee");









    }


}
