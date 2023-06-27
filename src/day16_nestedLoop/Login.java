package day16_nestedLoop;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        String u="Cydeo";
        String p="WoodenSpoon";
        int attempt=3;//for the do-while loop, we can also set a limit by declaring an additional variable before the loop.
        do {
            System.out.println("Enter your username:  ");
            u=input.next();
            System.out.println("Enter your password: ");
            p=input.next();
            attempt--;

            if(attempt==0){
                break;
            }

        }while(! (u.equals("Cydeo")&& p.equals("WoodenSpoon")) );//while the credentials are invalid.That's why, as long as we provide invalid condition, do loop will repeat the statements inside.



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