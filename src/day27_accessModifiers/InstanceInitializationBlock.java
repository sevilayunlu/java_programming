package day27_accessModifiers;

public class InstanceInitializationBlock {//cannot be passed any arguments
    public String name;
    public int age;

   /* {//the same values are assigned the variables by default.
        name= "James";
        age=20;


    }*/

    public InstanceInitializationBlock(String name, int age) {//any name or any age can be written.
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        InstanceInitializationBlock obj1=new InstanceInitializationBlock("James",45);
        InstanceInitializationBlock obj2=new InstanceInitializationBlock("Jim",32);


        System.out.println(obj1.name);

        System.out.println(obj2.name);
    }








}
