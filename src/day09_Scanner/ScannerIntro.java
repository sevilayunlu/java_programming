package day09_Scanner;

//import java.util.*;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        byte num1 = input.nextByte();
        System.out.println("Enter your second number: ");
        short num2 = input.nextShort();
        System.out.println("Enter your third number:");
        int num3 = input.nextInt();
        System.out.println("Enter your forth number:");
        long num4 = input.nextLong();
        input.close();//scanner is closed
        /*int  num5=input.nextInt();
        System.out.println("Enter your fifth number: ");
        scanner is closed at line18, once it os closed , cannot read inputs

        */

        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: " + num3);
        System.out.println("Fourth number: " + num4);
        // System.out.println("Fifth number: "+ num5);


//  input.close();//scanner is closed

    }


}
