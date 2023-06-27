package day37_exceptions;

import java.io.FileInputStream;

public class ExceptionsIntro {
    public static void main(String[] args) {

        String str="Java";
       // char ch=str.charAt(250);//StringIndexOutOfBoundsException-- without dealing with this problem, other code fragments under this code will never be executed.
        //System.out.println(ch);

        Pizza pizza=null;
       // pizza.calcCost();//there is no such an object--NullPointerException--unexpected


        System.out.println(50/0);//ArithmeticException

        System.out.println("Hello world");
        System.out.println("--------------------------------");
        int score=100;
        if(score>59){
            System.out.println("Your grade is D");
        }else if(score>70){
            System.out.println("Your grade is C");//there is a bug but not en exception. when the exception occurs, the program will crash
        }
        System.out.println("-------------------------------");
        //FileInputStream file=new FileInputStream()//checked exception--unwanted

        //Thread.sleep(3000);//checked exception



    }
}
