package day27_accessModifiers;

public class StaticBlock {

    public StaticBlock(){
        System.out.println("Constructor");
    }



    public static void main(String[] args) {

        System.out.println("Main Method");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }
    static{//the execution is not based on the object

        System.out.println("Static Block");

    }





}
