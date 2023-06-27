package day26_statics.students;

import day26_statics.students.Student;
import day26_statics.students.StudentsGroup;

public class TestObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Yusuf", 21, 'M', "A16");
        Student student2 = new Student("Glenio",24,'M',"B24");
        Student student3 = new Student("Sumeyye",22,'F',"C56");
        Student student4 = new Student("Mehmet",25,'M',"D43");
        Student student5 = new Student("Sebastian",23,'M',"E27");

        Student[] students ={student2,student3,student4,student5};

        StudentsGroup group1=new StudentsGroup("Java Turtles",1);
        group1.addStudent(student1);
        group1.addStudent(students);
        group1.addStudent("Khaskavar",34,'M',"F35");
        System.out.println(group1);
        group1.removeStudent("D43");
        System.out.println(group1);
        for (Student eachStudent : group1.students) {
            System.out.println(eachStudent.name+":"+eachStudent.id);

        }
        System.out.println("-----------------------------------------------------");
        StudentsGroup group2=new StudentsGroup("Java Turtles",1);
        StudentsGroup group3=new StudentsGroup("Java Turtles",1);
        StudentsGroup group4=new StudentsGroup("Java Turtles",1);
//iterate each group
        StudentsGroup[] groups={group1,group2,group3,group4};





    }


}
/*
 Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list








 */