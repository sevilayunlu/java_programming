package day12_customMethods;

import java.util.Scanner;

public class FormatFullName {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your first name:");
        String first=input.nextLine().trim().replace(" ","");

        // trim and replace methods will make sure that the white spaces and additional spaces between the characters will be removed
        System.out.println("Enter your last name:");
        String last=input.nextLine().trim().replace(" ","");
        input.close();


        first=first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
        // getting first character of the first name+the remaining characters of the first name
        last=last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();


        String fullName=first+" "+last;
        System.out.println(fullName);




    }






}
/*
1. Write a program that asks user to enter first and last names,
 and then prints the full name in regular format (first character in upper case)

	                    input:
	                        firstName = "cyDEo"
	                        lastName = "SCHOOL";

	                    output:
	                        Cydeo School


*/