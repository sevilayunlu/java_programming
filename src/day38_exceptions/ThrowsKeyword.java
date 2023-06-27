package day38_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException /*throws ArithmeticException */ {

       /* System.out.println("Program1 started");

        // System.out.println(100/0);//we cannot use throws keyword to handle with the unchecked exception

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        System.out.println("Program1 ended");

        System.out.println("---------------------------------------");

        System.out.println("Program2 started");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }//instead of calling try catch for each time, using throws keyword will be an effective choice

        System.out.println("Program2 ended");

    }*/

        System.out.println("Program1 started");

        Thread.sleep(5000);

        System.out.println("Program1 ended");

        System.out.println("---------------------------------------");

        System.out.println("Program2 started");

        Thread.sleep(3000);

        System.out.println("Program2 ended");

        System.out.println("--------------------------------------");












    }


}
