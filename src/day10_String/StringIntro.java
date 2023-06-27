package day10_String;

import java.util.Scanner;

public class StringIntro {

    public static void main(String[] args) {

       Scanner input =new Scanner (System.in);
                String str="Java";

        System.out.println();
        System.out.println("------------------------");



        String s1="Cat";
        String s2="Dog";


        String s3="Cat";
        String s4="Cat";

        System.out.println(s1==s3);//true
        System.out.println(s1==s4);//true
        System.out.println(s3==s4);//true

        System.out.println("------------------------");
        String str1 =new String("Java");// creates 2 objects:1.in String pool 2.in heap
        String str2=new String("Java");

        System.out.println(str1==str2);
        System.out.println("-------------------------------------");

        String t1="Python";
        String t2=new String("Python");
        String t3=new String("Python");

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

        System.out.println("--------------------------------------");
        System.out.println(t1==t2);//false
        System.out.println(t3==t2);//false


    }


 public static class EmployeeInfo {

     public static void main(String[] args) {

         Scanner input= new Scanner(System.in);


         System.out.println("Enter your full_name: ");
         String full_name=input.nextLine();

         System.out.println("Enter your age: ");
         byte age= input.nextByte();

         System.out.println("Enter your gender: ");
         char gender=input.next().charAt(0);

         input.nextLine();

         System.out.println("Enter your company name: ");
         String companyName=input.nextLine();

         System.out.println("Enter your job title: ");
         String jobTitle=input.nextLine();

         System.out.println("Enter your salary: $ ");
         double salary=input.nextDouble();


         System.out.println("full_name = " + full_name);
         System.out.println("age = " + age);
         System.out.println("gender = " + gender);
         System.out.println("companyName = " + companyName);
         System.out.println("jobTitle = " + jobTitle);
         System.out.println("salary = " + salary);

         input.close();



     }
 }
}
