package day26_statics.students;

import day26_statics.students.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentsGroup {//StudentsGroups HAS A Student(known as has a relationship)


    public String groupName;
    public int groupId;
    public ArrayList<Student> students = new ArrayList<>();


    public StudentsGroup(String groupName, int groupId) {
        this.groupName = groupName;
        this.groupId = groupId;
        //students=new ArrayList<>();//size:0(the other way of creating the arraylist)


    }//creates the StudentsGroup object by setting the groupName and groupId




    public void addStudent(Student student) {
    students.add(student);

    }//takes one student object and adds it to the arraylist of students

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }//takes one array of student and adds the array of students to the arraylist of students

    public void addStudent(String name, int age,char gender,String id){
       // Student student=new Student(name,age,gender,id);
        students.add(new Student(name,age,gender,id));
    }//takes name,age,gender and id of the student info and creates student object bxy using the given info.
    // Then it adds the student object to the arraylist of student

    public void removeStudent(String id){

        students.removeIf(p->p.id.equals(id));

    }//takes one argument and then removes the student object with specified id from the arraylist of students.



    public String toString() {
        return "StudentsGroup{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", number of students=" + students.size() +
                '}';
    }
}
/*

 Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constructor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement







 */