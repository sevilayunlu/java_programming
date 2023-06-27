package day38_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword2 {
    public static void main(String[] args) throws InterruptedException {

method1();

    }

    public static void pauseFor5Seconds() throws InterruptedException{
        Thread.sleep(5000);
    }


public static void method1() throws InterruptedException {
    System.out.println("Hello world");
    pauseFor5Seconds();
    System.out.println("Hello Cydeo");
}

//throws keyword does not solve the problem permanently. The caller of the method is responsible to handle the exception.
//It would be not be wise to use throws keyword in custom methods.

    public static void method2() throws InterruptedException, FileNotFoundException {

        System.out.println("First program started");

        Thread.sleep(3000);

        System.out.println("First program ended");

        new FileInputStream("");

        Thread.sleep(5000);
    }
//exceptions are temporarily handled






}
