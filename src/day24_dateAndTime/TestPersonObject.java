package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObject {

    public static void main(String[] args) {

        Person[] people= {new Person(),new Person(),new Person(),new Person(),new Person()};

        people[0].setInfo("Daniel",'M', LocalDate.of(1989,2,25));
        people[1].setInfo("Sevilay",'F',LocalDate.of(1990,11,25));
        people[2].setInfo("Alper",'M',LocalDate.of(1960,11,14));
        people[3].setInfo("Emrah",'M',LocalDate.of(1955,3,6));
        people[4].setInfo("Hakan",'M',LocalDate.of(2015,7,15));





        ArrayList<Person> studentsList=new ArrayList<>();
        studentsList.addAll(Arrays.asList(people));
        System.out.println(studentsList);
        System.out.println("----------------------------------");

        //print name and the dateOfBirth of each person object
        for(Person each:studentsList){
            System.out.println(each.name+" : "+each.dateOfBirthday);
        }

        //remove all the person object that has the age >55

        studentsList.removeIf(p->p.age>55);
        System.out.println(studentsList);







    }




}
