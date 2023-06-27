package day33_abstraction.employeeTask;

public  /*final */ abstract class Employee {//abstract is meant to be a super class, and it cannot be used with final keyword

private String name;
private int age;
private char gender;
private String id;;
private String jobTitle;
private double salary;


    public Employee(String name, int age, char gender, String id, String jobTitle, double salary) {
       setName(name);
       setAge(age);
       setGender(gender);
       setId(id);
       setJobTitle(jobTitle);
       setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();//abstract method(uncompleted method): this method has to be overridden.Subclasses are responsible for providing the implementations that are needed


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
Employee:
		Variables:
			name, age, gender, id, jobTitle, salary ....

		Methods:
		  abstract work();

*/