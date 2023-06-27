package day09_Scanner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);//Enter++Enter is left in the Scanner's memory

        System.out.println("Enter your full_name: ");
        String full_name=input.nextLine();//Sevilay ünlü+Enter

        System.out.println("Enter your school name:");
        String school_name=input.nextLine();//Cydeo School+Enter

        System.out.println("Enter your gender: ");
        String gender =input.next();//Female+Enter

        System.out.println("Enter your age: ");
        int age =input.nextInt();//28


        input.nextLine();//we have to give extra nextLine method,           //Clear out the scanner's memory
        // if we are using this method after the other methods of scanner.

        System.out.println("Enter your street name: ");
        String street=input.nextLine();




    }
}
