package day40_collections;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {

        Collection<Integer> collection=new ArrayList<>();

        collection.add(100);
        collection.addAll(Arrays.asList(100,200,300,400,500,600,700));

        System.out.println(collection);
        System.out.println(((ArrayList) collection).get(2));//we cannot reach to the get method because it is not available in the reference.That's why, we need downcasting

        System.out.println("-----------------------------------------");

        Collection<Integer> collection2=new HashSet<>();
        collection2.addAll(Arrays.asList(100,200,100,200,300,400,500,600,700,100,100));
        System.out.println(collection2);

        //System.out.println(((ArrayList)collection2).get(4)); we cannot make down casting here, because arraylist and hashset do not have an IS A relation

        System.out.println(new ArrayList<>(collection2).get(4));
        List<Integer> l=new ArrayList<>(collection2);













    }
}
