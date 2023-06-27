package day25_constructor;

import java.time.LocalDate;

public class TestEmployeeObjects {
    public static void main(String[] args) {
       Employee e1= new Employee("Khaskavar",32,'M',"JavaDeveloper",95000, LocalDate.of(2022,4,13)) ;
       Employee e2= new Employee("Mohammed",31,'M',"Project Manager",120000,LocalDate.of(2021,5,7));
        System.out.println(e1);
        System.out.println(e2);



    }
}
