package day18_garbageCollection;

class Car{




    public String color;
    public String brand;
    public String model;
}

public class MemoryAllocations {


    public static void main(String[] args) {


        int a =100;//a and 100 in stack
        Car car =new Car();//
        //car is the reference variable
    }


    public static void method1(){


        int b=200;//stack
    }

    public static void method2(){


        String c ="Hello World";//c in stack, "Hello World" in heap in string pool


        String d=new String ("Hello World");//d i  stack, "HelloWorld " in Heap outside  the string pool
    }




}
