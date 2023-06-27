package day41_maps;

import day28_encapsulation.personTask.Person;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(7, 8, 9, 10, 11));

        List<List<Integer>> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);

        System.out.println(lists);
        System.out.println(lists.get(1).get(3));//10


        for (List<Integer> eachList : lists) {
            for (Integer eachElement : eachList) {
                System.out.println(eachElement);
            }
        }

        System.out.println("-------------------------------------------");
        List<Set<Integer>> listOfSets = new ArrayList<>();
        listOfSets.add(new LinkedHashSet<>());//0
        listOfSets.add(new LinkedHashSet<>());//1
        listOfSets.add(new LinkedHashSet<>());//2
        listOfSets.add(new LinkedHashSet<>());//3

        System.out.println(listOfSets);

        listOfSets.get(0).addAll(Arrays.asList(10, 5, 20, 10, 5, 20));
        listOfSets.get(1).addAll(Arrays.asList(30, 15, 3, 6));

        System.out.println(listOfSets);//[[10, 5, 20], [30, 15, 3, 6], [], []]==set does not allow duplicates

        System.out.println("-------------------------------------------");

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9, 10};

        List<int[]> listOfArrays = new ArrayList<>();
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);
        // System.out.println(listOfArrays);//[[I@48140564, [I@58ceff1]==without toString method, arrays cannot be printed
        listOfArrays.get(0)[2] = 35;
        System.out.println(Arrays.toString(listOfArrays.get(0)));

        System.out.println("-------------------------------------------");

        // List<List<Person>> teams=new ArrayList<>();


        System.out.println("-------------------------------------------");

        // List<int[] []> l=new ArrayList<>();==because array itself is an object, we can also create a list of multidimensional array


    }
}
