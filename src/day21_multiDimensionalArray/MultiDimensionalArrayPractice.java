package day21_multiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String[] group1 = {"James", "Daniel", "Safiye", "Ömer"};//4
        String[] group2 = {"Ibrahim", "Merve", "Hamide"};//3
        String[] group3 = {"Gülnaz", "Ismail", "Etga", "Ayse", "Fatma"};//5
        String[] group4 = {"Ali", "Yalcin"};//2


        String[][] groups = {group1, group2, group3, group4};


        /*for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachElement : eachGroup) {
                System.out.println(eachElement);
            }
        }*///for each loop

        for (int i = 0; i < groups.length; i++) {
            String[] eachGroup = groups[i];
            System.out.println(Arrays.toString(groups[i]));
            for (int j = 0; j < eachGroup.length; j++) {
                String eachStudent = eachGroup[j];
                System.out.println(eachStudent);
            }
        }

        System.out.println("----------------------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroup1=groups[i];
            System.out.println(Arrays.toString(eachGroup1));//toString () is just for one dim. arrays.

            for (String eachStudent1 : eachGroup1) {
                System.out.println(eachStudent1);
            }
        }

        System.out.println("-----------------------------------");

        System.out.println(Arrays.deepToString(groups));//deeptoString() is for multi-dim. arrays
    }
}
