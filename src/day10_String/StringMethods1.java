package day10_String;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class StringMethods1 {

    public static void main(String[] args) {

        String str="Cydeo";
        //    index:01234

        char firstChar= str.charAt(0);
        char secondChar=str.charAt(1);
        char thirdChar=str.charAt(2);
        char fourthChar=str.charAt(3);
        char fifthChar=str.charAt(4);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);

       // char sixthChar= str.charAt(5);//StringIndexOutOfBoundsException

       //System.out.println(sixthChar);
        System.out.println("-----------------------------------------");

        String sentence="Java Programming Language";//spaces are also sequence of characters.
        int length=sentence.length();
        System.out.println(length);
        int lastIndex=length-1;
        System.out.println(lastIndex);
        System.out.println("--------------------------------------------");

        String s1 ="Wooden Spoon";
        char f=s1.charAt(0);
        int lastIndexNumber= s1.length()-1;
        char l =s1.charAt(lastIndexNumber);

        System.out.println(f+" : "+ l);
        System.out.println("---------------------------------------------");

        String name1="Umran";
        String name2= new String("Umran");

        System.out.println(name1==name2);//compares the objects
        System.out.println(name1.equals(name2));//compares the values.

        System.out.println("-------------------------------------------");

        String r1= "Java";
        String r2= "Java";
        String r3=new String ("Java");

        System.out.println(r1==r2);//true
        System.out.println(r1==r3);//false
        System.out.println(r2==r3);//false


        System.out.println(r1.equals(r3));//true--compares the text(value)

        System.out.println("-----------------------------------------");

        Scanner input =new Scanner (System.in);

        System.out.println("How old are you?");
        int age=input.nextInt();

        System.out.println("Are you a US citizen? yes/no");
        String answer = input.next();

        if(age>=21 && answer.equals("yes")){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }


        input.close();


    }

    public static class ShippingAddress {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);//scanner object
            System.out.println("Enter your full_name:");
            String full_name = input.nextLine();//Cydeo School+Enter
            System.out.println("Enter your building number: ");
            String buildingNumber = input.next();

            input.nextLine();//to clear the scanner.Sca

            System.out.println("Enter your street name: ");
            String streetName = input.nextLine();
            System.out.println("Enter your city name: ");
            String cityName = input.nextLine();
            System.out.println("Enter your state: ");
            String stateName = input.nextLine();
            System.out.println("Enter your zip code: ");
            String zipCode = input.next();


            System.out.println("full_name = " + full_name);
            System.out.println("buildingNumber = " + buildingNumber);
            System.out.println("streetName = " + streetName);
            System.out.println("cityName = " + cityName);
            System.out.println("stateName = " + stateName);
            System.out.println("zipCode = " + zipCode);

            System.out.println(" Your shipping address is:");
            System.out.println("\t"+ full_name);
            System.out.println("\t"+ buildingNumber+" "+streetName);
            System.out.println("\t"+ cityName+", "+stateName+" "+zipCode);

        input.close();
        }
    }

    public static class ReadFileWithScanner {
        public static void main(String[] args) throws IOException {

            Scanner scan= new Scanner(Path.of("src/day10_String/Test.txt"));



           /* System.out.println(scan.nextLine());
            System.out.println(scan.nextLine());
            System.out.println(scan.nextLine());*/

           /* System.out.println(scan.next());
            System.out.println(scan.next());
            System.out.println(scan.next());
            System.out.println(scan.next());
            System.out.println(scan.next());
            System.out.println(scan.next());
            System.out.println(scan.next());*/


            //System.out.println(scan.hasNext());

            scan.close();


        }
    }
}
