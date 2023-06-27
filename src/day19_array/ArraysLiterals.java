package day19_array;

import java.util.Arrays;

public class ArraysLiterals {
    public static void main(String[] args) {

        int[] numbers= new int[5];

        int[] nums={1, 2, 3, 4, 5};//Array Literal

        System.out.println(numbers.length);
        System.out.println(nums.length);


        System.out.println("nums = "+Arrays.toString(nums));
        System.out.println("numbers = " +Arrays.toString(numbers)) ;

        System.out.println("-----------------------------------------");

        String [] days={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        int n=1;
        System.out.println(days[n-1]);

        System.out.println("-----------------------------------------");

        String [] months= {"January", "February","March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        System.out.println("months = " + Arrays.toString(months));
        System.out.println("-----------------------------------------");

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.print(months[i]+" ");

        }




    }
}
