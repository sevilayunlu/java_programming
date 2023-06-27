package day27_accessModifiers;

public class InstanceBlock {

    {

        System.out.println("Instance block");//instance block will get executed before the constructor when the object is created.

    }


    public InstanceBlock(){

        System.out.println("Constructor");

    }

    public static void main(String[] args) {
        new InstanceBlock();
        new InstanceBlock();
        new InstanceBlock();
    }

}
