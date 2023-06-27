package day23_arrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {

       int []  array={1,2,3,4,5};
       array[0]=100;
       System.out.println(Arrays.toString(array));
        System.out.println("--------------------------");
        ArrayList<String> groceriesList=new ArrayList<>();
        groceriesList.add("Eggs");
        groceriesList.add("Paper Towels");
        groceriesList.add("Apples");
        groceriesList.add("Cooking oil");
        System.out.println(groceriesList);

       // groceriesList[2]="Oranges";

        groceriesList.set(2,"Oranges");//apples--oranges(set method changes the element
        System.out.println(groceriesList);
        System.out.println("-------------------------");

        groceriesList.add(2,"Pineapples");//add method increases the number of elements and keeps the one at that index number
        System.out.println(groceriesList);
        System.out.println("--------------------------");
        groceriesList.remove(0);
        System.out.println(groceriesList);//[Paper Towels, Pineapples, Oranges, Cooking oil]
        groceriesList.remove(0);
        System.out.println(groceriesList);//[Pineapples, Oranges, Cooking oil]
        System.out.println("---------------------------");
        groceriesList.remove("Pineapples");
        System.out.println(groceriesList);
        System.out.println("---------------------------");



        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);


        boolean r1=numbers.remove(Integer.valueOf(20));
        System.out.println(numbers);
        System.out.println(r1);
        System.out.println("--------------------------------");

        numbers.clear();
        System.out.println(numbers);
        int size=numbers.size();
        System.out.println(size);
        System.out.println("-----------------------------------");

          ArrayList<String> names=new ArrayList<>();


          names.add("Vasyl");
          names.add("Vasyl");
          names.add("Sumeye");
          names.add("Sumeye");
          names.add("Ali");
          names.add("Sumeye");


        System.out.println(names.indexOf("Vasyl"));
        System.out.println(names.lastIndexOf("Vasyl"));
        System.out.println(names.lastIndexOf("Sumeye"));
        System.out.println(names.indexOf("Sumeye"));

        boolean hasMuhtar=names.contains("Muhtar");//false
        boolean hasAli=names.contains("Ali");//true

        System.out.println("hasMuhtar = " + hasMuhtar);
        System.out.println("hasAli = " + hasAli);

        System.out.println("-------------------------");


        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=list1;

        System.out.println(list1==list2);

        list1.add(10);
        System.out.println(list1);
        System.out.println(list2);

        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l1.add(10);
        l2.add(10);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l1==l2);
        System.out.println(l1.equals(l2));




    }
}
