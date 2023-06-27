package day27_accessModifiers;

public class StaticInitializationBlock {

    public static int a;
    public static double b;
    public static String c;


    static {//whenever we need static variables,
        // we should use static block to initialize the variables.
              a=100;
              b=20.5;
              c="Java";

    }

    /*public StaticInitializationBlock(){
        a=100;
        b=20.5;
        c="Java";


   }*/
    /*
    As soon as the class is loaded, static block gets executed and it gets executed just one time?




     */






}
