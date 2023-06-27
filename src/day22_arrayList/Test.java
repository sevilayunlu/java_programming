package day22_arrayList;

import Utilities.ArrayUtility;

public class Test {

    public static void main(String[] args) {

        int[] numbers ={10,20,30,40,50,60,70,90};

        boolean has25= ArrayUtility.contains(numbers,67);
        System.out.println("has25 = " + has25);
        System.out.println();
        System.out.println("-------------------------------");

        String[] students= {"Sumeye", "Hamza", "Harika"};

        System.out.println(ArrayUtility.contains(students," Khaskavar"));
        System.out.println("-------------------------------");






    }
}
