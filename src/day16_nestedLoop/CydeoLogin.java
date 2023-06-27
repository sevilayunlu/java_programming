package day16_nestedLoop;

import day05_operators.SalaryCalculator;

import java.util.Scanner;

public class CydeoLogin {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your username: ");
        String u=input.next();

        System.out.println("Enter your password: ");
        String p=input.next();


        if(u.equals("Cydeo")&&p.equals("WoodenSpoon")){//if the credentials are valid
            System.out.println("Logged in.");
        }else{   //otherwise
            for (int i = 0; i <3 ; i++) {
                
                System.err.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username: ");
                 u= input.next();

                System.out.println("Enter your password");
                p= input.next();

                if(u.equals("Cydeo")&&p.equals("WoodenSpoon")){//if the user enters valid credentials

                    System.out.println("You are now logged in.");
                    break;
                }

            }

            if (! (u.equals("Cydeo")&&p.equals("WoodenSpoon"))){//after all three attempts,if the username is invalid
                System.out.println("Your account now is locked, please contact with the support team.");
            }


        }

        input.close();





    }
}
/*
1. Create a class named CydeoLogIn. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."

                If the credentials are not matched, the program should allow
                the user to have three attempts to enter correct credentials

                if all three attempts are failed, then print "Your account is lucked."



 */