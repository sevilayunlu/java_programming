package day37_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchBlocks2 {

    public static void main(String[] args) {

        System.out.println("Program1 started");

        int[] arr = {1, 2, 3, 4};

        try {
            System.out.println(arr[100]);
        } catch (RuntimeException e) {//java.lang.ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 4
            // at day37_exceptions.TryCatchBlocks2.main(TryCatchBlocks2.java:12)
            //printStackTrace method is inherited to the all exception types,
            // and we can call it thorough the exception object to see the details of the exception after the execution of the program.
            //program ends with the exit code 0.
            e.printStackTrace();//can be seen only in the catch block
        }

        System.out.println("Program1 ended");

        System.out.println("-------------------------------------");

        System.out.println("Program2 started");
        try{
            System.out.println(9/0);
        }catch(RuntimeException e){
            e.printStackTrace();//to see the full track is much better than just getMessage()
            //System.out.println(e.getMessage()); --/ by zero
        }

        System.out.println("Program2 ended");
        System.out.println("--------------------------------------");

        try {
            FileInputStream file= new FileInputStream("File Path");
        } catch (FileNotFoundException e) {
           e.printStackTrace();
        }


    }
}
