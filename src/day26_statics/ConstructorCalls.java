package day26_statics;

public class ConstructorCalls {


    public ConstructorCalls(){

        System.out.println("default constructor");

    }
    public ConstructorCalls(int a){
        //ConstructorCalls();-- constructors cannot be called by its name. therefore, it gives compile error.
        // We have to use this()
        this();
        System.out.println("constructor with int argument");
        //this();// constructor call must be at the first step

    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }



    public static void main(String[] args) {

        method1();
        System.out.println("------------------");
        method2();




    }






    public static void method1(){
        System.out.println("Method 1");


    }


        public static void method2(){
        method1();
            System.out.println("Method 2");

        }

}
