package day15_whileLoop;

import java.util.Scanner;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int max=-2147483648;//any integer number that user enter will always be greater than this number
        int min= 2147483647;//any integer number that user enter will always be less than this number
        for (int i = 0; i <5 ; i++) {

            System.out.println("Enter a number");
            int num=input.nextInt();

            if(num>max){
               max=num;
            }
            if(num<min){
                min=num;
            }



        }

        System.out.println("maximum number is: "+max);
        System.out.println("minimum number is: "+min);


    }
}
