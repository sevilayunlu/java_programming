package day19_array;

import java.util.Arrays;

public class ArraysPractice1 {
    public static void main(String[] args) {

        String[] myGroup=new String[5];//the last index number is 4

        myGroup[0]="Gülcin";
        myGroup[myGroup.length-1]="Aseel";
        myGroup[2]="Sumeye";
        myGroup[1]="Abidullah";
        myGroup[3]="Khashavar";

        System.out.println(Arrays.toString(myGroup));
        myGroup[1]="Kuzzat";
        //myGroup[5]="Muhtar";//ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        System.out.println(Arrays.toString(myGroup));
        System.out.println("_______________________________________");
        for(int i= myGroup.length-1; i>=0; i--){
            System.out.println(myGroup[i]);
        }
        System.out.println("______________________________________");

        //for (int i = 0; i < myGroup.length; i++) {} shortcut myGroup.fori

        //for (int i = myGroup.length - 1; i >= 0; i--) {} shortcut myGroup.forr







    }

}
