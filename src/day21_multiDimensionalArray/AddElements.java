package day21_multiDimensionalArray;

import Utilities.ArrayUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {

        int [] array={1,2,3,4,5};
        int element=6;

        //expected result={1,2,3,4,5,6}

        int[] newArray= Arrays.copyOf(array,array.length+1);
        newArray[newArray.length-1]=element;


        System.out.println(Arrays.toString(newArray));


        int[] numbers={100,90,80,70,60};
        System.out.println(Arrays.toString(numbers));
        numbers= ArrayUtility.addElement(numbers,50);
        System.out.println(Arrays.toString(numbers));







        double[] nums={1.5,4.6,4.5,4.8};
        nums= ArrayUtility.addElement(nums,5.5);
        System.out.println(Arrays.toString(nums));


        String[] names={"Emrah","Sumeyye"," Ayse"};
        names= ArrayUtility.addElement(names,"Umran");
        names= ArrayUtility.addElement(names,"Sevilay");
        names= ArrayUtility.addElement(names,"Safiye");
        System.out.println(Arrays.toString(names));








    }








}
