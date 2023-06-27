package day20_forEach;

import Utilities.ArrayUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str="Cydeo School";
       char[]  ch=str.replace(" ","").toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println("--------------------------------------");

        String str2="Today is a great day to learn java";
        String[] words=str2.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("--------------------------------------");

        String sentence="I love Java";

        //"Java love I"
       String[] array= ArrayUtility.reverse(sentence.split(" ")) ;
        System.out.println(Arrays.toString(array));

        String reversedSentence="";

        for (int i = 0; i < array.length ; i++) {
            reversedSentence+=array[i]+" ";

        }

        System.out.println(reversedSentence);
    }
}
