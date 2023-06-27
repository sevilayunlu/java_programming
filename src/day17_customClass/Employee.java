package day17_customClass;

public class Employee {
    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public String employeeID;




    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String employeeID) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;
    }//sets all the attributes of the Employee object at once
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", employeeID='" + employeeID + '\'' +
                '}';
    }//to avoid getting hash code when we print employee object
    public void work(){
        System.out.println(name+" is working.");
    }



}
