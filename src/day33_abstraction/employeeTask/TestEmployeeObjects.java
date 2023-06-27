package day33_abstraction.employeeTask;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        //Employee employee=new Employee("Daniel",34,"A1","Sdet",860000);
        // we cannot create objects from abstract classes.Object must be created from a consrete class

        Teacher teacher = new Teacher("James", 45, 'M', "b1", "Math Teacher", 750000);
        Developer developer = new Developer("Lucy", 35, 'F', "C1", "Java Developer", 95000, "Java");
        Driver driver = new Driver("Aaron", 48, 'M', "D1", "Truck driver", 90000);
        Tester tester = new Tester("Emily", 35, 'F', "E1", "Manual Tester", 80000);
        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);

        System.out.println("-------------------------------");

        teacher.work();
        developer.work();
        driver.work();
        tester.work();







    }
}
