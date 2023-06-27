package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);


        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list1.addAll(1,numbers);
        System.out.println(list1);
        System.out.println("-------addAll()---------");
        ArrayList<Integer> scores= new ArrayList<>();
        scores.addAll(Arrays.asList(75,85,95,80,70));

        System.out.println(scores);
        System.out.println("-------------------------------");
        ArrayList<String> students=new ArrayList<>();
        students.addAll(Arrays.asList("Gadir","Hasan","Abidullah","Bilal"));
        System.out.println(students);
        students.addAll(2,Arrays.asList("Shukur","Sumeye","Tatiana"));//3 elements are added to the index 2.
        System.out.println(students);

        System.out.println("-------------------------------");

        Integer [] nums={1,2,3,4,5,6,7};
        ArrayList<Integer> l1=new ArrayList<>(Arrays.asList(nums));//1. way to convert an array to the collection
        //l1.addAll(Arrays.asList(nums));//2. way to convert an array to the collection
        System.out.println(l1);

        System.out.println("--------containsAll(}--------");

        ArrayList<String> employeesList=new ArrayList<>();
        employeesList.addAll(Arrays.asList("Alina","Muhtar","Gadir","Ali"));
        System.out.println(employeesList);

        boolean hasAlina=employeesList.contains("Alina");
        System.out.println(hasAlina);
        boolean hasAlinaGadir=employeesList.containsAll(Arrays.asList("Alina","Gadir"));//order does not matter
        System.out.println(hasAlinaGadir);
        boolean hasMuhtarAliKuzzat=employeesList.containsAll(Arrays.asList("Muhtar","Ali","Kuzzat"));
        System.out.println(hasMuhtarAliKuzzat);


        System.out.println("----------removeAll()---------");

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,20,330,40,50,60,70,10,10,10,10,10,10,20,20,20));
        list.removeAll(Arrays.asList(10,20));
        System.out.println(list);

        System.out.println("-----------retainAll-----------");

        ArrayList<String> developers= new ArrayList<>();
        developers.addAll(Arrays.asList("Alina","Muhtar","Gadir","Ali","Mdivar","Muhtar","Khaskavar","Ali"));
        developers.retainAll(Arrays.asList("Alina","Gadir","Muhtar"));//removes the unmatching elements
        System.out.println(developers);

        System.out.println("-----------------------------------");
         ArrayList<String> groceriesList= new ArrayList<>();
         groceriesList.addAll(Arrays.asList("Eggs","Potato","Tomato","Rice","Orange","Strawberry","Blueberry","Paper towels"));
         //groceriesList.retainAll(Arrays.asList("Eggs","Potato","Tomato","Rice"));
        groceriesList.removeAll(Arrays.asList("Orange","Strawberry","Blueberry","Paper towels"));
        System.out.println(groceriesList);

    }
}
