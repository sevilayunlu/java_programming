package day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4,5,6,7));
        int max= Collections.max(list);
        int min=Collections.min(list);

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("-----------sort()-----------");
        ArrayList<String> items= new ArrayList<>(Arrays.asList("Eggs","Potato","Tomato","Rice","Orange","Strawberry","Blueberry","Paper towels"));
        Collections.sort(items);
        System.out.println(items);
        System.out.println("-------------reverse()-----------------");
        Collections.reverse(items);
        System.out.println(items);
        System.out.println("--------------swap()-------------");
        ArrayList<String> students= new ArrayList<>();
        students.addAll(Arrays.asList("Alina","Muhtar","Gadir","Ali","Mdivar","Muhtar","Khaskavar","Ali"));
        System.out.println(students);
        Collections.swap(students,0,1);//index numbers can be given in any order
        System.out.println(students);
        Collections.swap(students,0,students.size()-1);
        System.out.println(students);







    }
}
