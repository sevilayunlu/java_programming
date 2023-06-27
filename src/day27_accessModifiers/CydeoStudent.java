package day27_accessModifiers;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;

    public static String schoolName;
    public static String secretCode;

    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        //schoolName="Cydeo School";
        //secretCode="WoodenSpoon";
    }

    static{
        schoolName="Cydeo School";
        secretCode="Wooden Sppon";
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
