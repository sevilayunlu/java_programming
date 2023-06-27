package day28_encapsulation.encapsulation;

public class Employee {


    private String name;
    private int age;
    private String jobTitle;
    private double salary;
    public Employee(String name, double salary, int age, String jobTitle) {
        setName(name);//The benefit:it will not directly assign the age to the instance variable age.Firstly, it will execute thorough he set the age method and accepts the value.
        setAge(age);
        setJobTitle(jobTitle);
        setSalary(salary);
    }//from now on use setters in the constructor.They can also check if the argument is valid to set the variable


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16) {
            System.out.println("Invalid age: " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {

        if (jobTitle.isEmpty() || jobTitle.isBlank()) {
            System.err.println("Job title of the employee cannot be empty.");
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }

    public String getName() {
        if(name==null){
            name="Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty() || name.isBlank()) {
            System.err.println("Employee name cannot be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }

    public double getSalary() {//read

        if (name == null) {
            name = "Unknown";
        }
        return salary;
    }

    public void setSalary(double salary) {//write(update)

        if (salary < 0) {
            System.err.println("Salary cannot be negative: " + salary);
            System.exit(1);
        }
        this.salary = salary;
    }



    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                ", salary=" + getSalary() +
                '}';
    }
}
