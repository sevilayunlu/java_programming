package day16_nestedLoop;

import java.util.Scanner;

public class LoopPractices {
    public static void main(String[] args) {


        for (int i = 1; i <6; i++) {//in this case,i is the local variable and we can use many for loops in one class by using the same variable.
            System.out.println("Hello "+i);
        }
        System.out.println("------------------------");



        int j=0;
        while(j<5){
            System.out.println("Hello "+j);
            j++;
        }
        System.out.println("------------------------");


        int k=0;
        do{
            System.out.println("Hello "+k);
            k++;
        }while(k<5);
        System.out.println("---------------------------------");

        Scanner input=new Scanner(System.in);


        System.out.println("Enter your score");
        int score=input.nextInt();

        while(score>100 || score<0){//while stops when the condition is evaluated to false.
            System.out.println("Invalid score, please re-enter your score:");
            score=input.nextInt();

        if(score>=60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");


            }





        }





    }
}
