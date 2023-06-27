package day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){
        System.out.println("Constructor");
    }


    {
        System.out.println("Instance Block");
    }
//the execution of constructor and the instance block depends on the object. Without creating the object, they will never get executed.
//In this class, firstly, static block and then the main method will be executed.
//constructor can take argument but instance block cannot.
    static{

        System.out.println("Static Block");


    }


    public static void main(String[] args) {

        System.out.println("Main Method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor();//firstly. the instance block will be executed.
        new StaticBlock_vs_InstanceBlock_vs_Constructor();



    }






}
