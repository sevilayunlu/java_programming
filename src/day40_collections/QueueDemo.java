package day40_collections;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>();//order is random, does not accept null

        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue1.addAll(Arrays.asList(10, 200, 300, 40, 90));
        //queue1.addAll(Arrays.asList(null,null,null,null));


        System.out.println(queue1);

        queue1.poll();//== FIFO
        queue1.poll();
        queue1.poll();

        System.out.println(queue1);

        System.out.println("----------------------------------------");

        Queue<Integer> queue2 = new ArrayDeque<>();//maintains the insertion order, does not accept null

        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue2.addAll(Arrays.asList(10, 200, 300, 40, 90));


        System.out.println(queue2);

        queue2.poll();

        System.out.println(queue2);

        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();
        queue2.poll();

        System.out.println(queue2);
        System.out.println("------------------------------------");

        Queue<Integer> queue3 = new LinkedList<>();//insertion order is maintained,accepts null

        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(10, 200, 300, 40, 90));
        queue3.addAll(Arrays.asList(null, null, null, null));

        queue3.poll();

        System.out.println(queue3);
        System.out.println(((LinkedList) queue3).get(4));//we cn call the get method from the LinkedList.
        System.out.println("----------------------------------------");

        List<Integer> list = new LinkedList<>();//reference is the List interface. Normally, we cannot call poll method directly, we need to downcast to LinkedList
        list.addAll(Arrays.asList(10, 200, 300, 40, 90));
        System.out.println(list.get(1));

        System.out.println(list);

        ((LinkedList) list).poll();
        System.out.println(list);

        // ((Stack)list).pop(); //LIFO==ClassCastException== we cannot down cast LinkedList to Stack because tey do not have a Is A relation
        // System.out.println(list);


    }
}
