package day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Teacher extends Employee{//teacher is the child class of employee and employee is the child of person classes.Person is the grandparent of teacher

    public Teacher(String name, char gender, LocalDate DOB, String employeeId, String jobTitle, double salary) {
        super(name, gender, DOB, employeeId, jobTitle, salary);
    }

    public void teach(){

        System.out.println(getName()+" is teaching");
    }








}
