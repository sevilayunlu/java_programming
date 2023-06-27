package Utilities;

import java.util.Arrays;

public class ArrayUtility {


    public static int[] merge(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];//we need to make sure that the thord array has enough capacity to contain all the elements of array1 and array2

        int k = 0;//for the third array's index number

        for (int i = 0; i < arr1.length; i++, k++) {//i:for the first array's index number
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {//i:for the second array's index number
            arr3[k] = arr2[i];

        }


        return arr3;


    }

    public static double[] merge(double[] arr1, double[] arr2) {

        double[] arr3 = new double[arr1.length + arr2.length];//we need to make sure that the thord array has enough capacity to contain all the elements of array1 and array2

        int k = 0;//for the third array's index number

        for (int i = 0; i < arr1.length; i++, k++) {//i:for the first array's index number
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {//i:for the second array's index number
            arr3[k] = arr2[i];

        }


        return arr3;


    }

    public static char[] merge(char[] arr1, char[] arr2) {

        char[] arr3 = new char[arr1.length + arr2.length];//we need to make sure that the thord array has enough capacity to contain all the elements of array1 and array2

        int k = 0;//for the third array's index number

        for (int i = 0; i < arr1.length; i++, k++) {//i:for the first array's index number
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {//i:for the second array's index number
            arr3[k] = arr2[i];

        }


        return arr3;


    }

    public static String[] merge(String[] arr1, String[] arr2) {

        String[] arr3 = new String[arr1.length + arr2.length];//we need to make sure that the thord array has enough capacity to contain all the elements of array1 and array2

        int k = 0;//for the third array's index number

        for (int i = 0; i < arr1.length; i++, k++) {//i:for the first array's index number
            arr3[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++, k++) {//i:for the second array's index number
            arr3[k] = arr2[i];

        }


        return arr3;


    }



    public static int[] reverse(int[] array){

        int[] reverse= new int[array.length];

        for( int i=array.length-1,j=0; i>=0; i--,j++){
            reverse[j] =array[i];
        }
    return reverse;

    }

    public static double[] reverse(double[] array){

        double[] reverse= new double[array.length];

        for( int i=array.length-1,j=0; i>=0; i--,j++){
            reverse[j] =array[i];
        }
        return reverse;

    }

    public static char[] reverse(char[] array){

        char[] reverse= new char[array.length];

        for( int i=array.length-1,j=0; i>=0; i--,j++){
            reverse[j] =array[i];
        }
        return reverse;

    }

    public static String[] reverse(String[] array){

        String[] reverse= new String[array.length];

        for( int i=array.length-1,j=0; i>=0; i--,j++){
            reverse[j] =array[i];
        }
        return reverse;

    }


    public static int[] addElement(int[] array, int element){
        int[] newArray= Arrays.copyOf(array,array.length+1);
        newArray[newArray.length-1]=element;

        return newArray;
    }

    public static double[] addElement(double[] array, double element){
        double[] newArray= Arrays.copyOf(array,array.length+1);
        newArray[newArray.length-1]=element;

        return newArray;
    }

    public static char[] addElement(char[] array, char element){
        char[] newArray= Arrays.copyOf(array,array.length+1);
        newArray[newArray.length-1]=element;

        return newArray;
    }
    public static String[] addElement(String[] array, String element){
        String[] newArray= Arrays.copyOf(array,array.length+1);
        newArray[newArray.length-1]=element;

        return newArray;
    }


    public static boolean contains(int[] array, int element){

        for (int each : array) {
            if(each==element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(double[] array, double element){

        for (double each : array) {
            if(each==element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(char[] array, char element){

        for (char each : array) {
            if(each==element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(String[] array, String element){

        for (String each : array) {
            if(each.equals(element)){
                return true;
            }
        }
        return false;
    }

   /* public static int[] remove(int[] array, int index){



    }
    public static int[] removeDup(int[] array){

    }*/


}