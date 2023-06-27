package day14_forLoop;

import java.lang.reflect.AnnotatedType;

public class StringReverse {

    public static void main(String[] args) {

      String str="Sevilay";//avaJ
        String reverse="";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
        System.out.println("-----------------");
        String name="Ermek Keneshbekovich Apazov";
        String result=reverse(name);
        System.out.println(result);




    }

    public static String reverse(String str){
        String reverse="";//to contain all the characters of the given string in reverse
        for (int i = str.length()-1; i >=0 ; i--) {//i: indexx number of the given string starting from the last index to index 0.
            reverse+=str.charAt(i);//to get each characters of the string starting from the last index to index zero
        }
        return reverse;

    }



}
