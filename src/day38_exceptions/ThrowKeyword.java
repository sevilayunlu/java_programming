package day38_exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {

        System.out.println("Enter your age: ");
        int age = new Scanner(System.in).nextInt();
        if (age < 0 || age > 150) {
            if (age < 0) {
                // System.err.println("Invalid age: ");
                // System.exit(1);
                throw new InputMismatchException("Age of the person should not be negative: " + age);
            } else {
                throw new InputMismatchException("age of the person cannot be greater than 150: " + age);
            }
        }

        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not eligible");
        }
        System.out.println("---------------------------------------");
       // throw new RuntimeException("run time exception");
        //System.out.println();-- cannot be executed after throw exception was created

        try {
            throw new FileNotFoundException("");//we can also use throw keyword to throw a checked exception but there is no point in doing that because
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // checked exceptions can be seen immediately. We generally may not need to create an exception for the exceptions which we already see on the program.

        System.out.println("---------------------------------");

        RuntimeException exception=new RuntimeException();

        //throw exception;//we cannot use any object after the throw keyword which does not have any "is a" relationship with Throwable







    }
}
