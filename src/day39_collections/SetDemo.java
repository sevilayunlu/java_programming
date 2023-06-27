package day39_collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        System.out.println("---------------List------------------------");
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 200, 300, 40, 90));

        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));

        System.out.println(list);//List preserves the insertion order and allows duplicates
        //[10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90]

        System.out.println("----------------HashSet---------------------");

        Set<Integer> set1 = new HashSet<>();
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set1.addAll(Arrays.asList(null, null, null, null));


        System.out.println(set1);//Set does not preserve the insertion order and does not allow duplicates
        //[200, 40, 10, 90, 300]

        System.out.println("----------------LinkedHashSet----------------");

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set2.addAll(Arrays.asList(null, null, null, null));

        System.out.println(set2);//LinkedHashSet preserves the insertion order, accepts null and does not accept duplicates
        //[10, 200, 300, 40, 90, null]

        System.out.println("---------------------TreeSet----------------");

        Set<Integer> set3 = new TreeSet<>();
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        set3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        // set3.addAll(Arrays.asList(null, null, null, null));

        System.out.println(set3);//TreeSet does not allow null because it compares the element in it by inheriting some methods from also the object class.In addition, tressSet executes the elements in an ascending order
        //NullPointerException


        System.out.println("----------------------------");

        String[] words = {"Java", "Java", "Java", "Python", "Python", "C#", "C#", "C+", "C+", "Ruby"};
        Set<String> result = new LinkedHashSet();
        result.addAll(Arrays.asList(words));

        System.out.println(result);//[Java, Python, C#, C+, Ruby]--order did not change

        //System.out.println(result.get(1));

        /*for (String each : result) {
            System.out.println(each);
        } for each loop -- a way to reach the elements of Set*/

        //There is a constructor in ArrayList and this constructor takes a collection as an argument.
        // When we use this constructor,
        // we can also use the methods of arrayList to access to the elements of Set.

        System.out.println(new ArrayList<>(result).get(1));//Python --we got the second element

        words = result.toArray(new String[0]);
        System.out.println("Words Array: " + Arrays.toString(words));//[Java, Python, C#, C+, Ruby]

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10, 10, 10, 29, 2, 3, 4, 5, 6, 7, 20, 40, 100));

        Set<Integer> n = new TreeSet<>(numbers);

        System.out.println(n);


    }
}
