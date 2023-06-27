package day40_collections;

import java.util.*;

public class IterableExample {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        /*for (Integer each : list) {
            if (each < 5) {
                list.remove(each);==
            }
        }
        System.out.println(list);//ConcurrentModificationException */


       /* for (int i = 0; i < list.size(); i++) {//(the remove method of collection will not properly remove the elements)
      //Without iterable, we cannot do this.
            if(list.get(i)<5){
                list.remove(i);
            }

        }
        System.out.println(list);//[2, 4, 5, 6, 2, 4, 5, 6, 7, 2, 4, 5, 6, 7]== there are still elements which are less than 5*/

        Iterator<Integer> it = list.iterator();

        while (it.hasNext()) {//while loop is preferred

            Integer each = it.next();
            if (each < 5) {
                it.remove();//remove method of iterator
            }
        }
        System.out.println(list);


        System.out.println("-----------------------");
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));

        for (Iterator<Integer> i = list2.iterator(); i.hasNext(); ) {//the number of iteration in this loop depends on the element which we have in the Arraylist.
            // That's why, we do not need any increment

            Integer each = i.next();

            if (each < 5) {
                i.remove();
            }
        }
        System.out.println(list2);

        System.out.println("-----------------------");

        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));


        list3.removeIf(each -> each < 5);//removeIf uses implicitly the iterator
        System.out.println(list3);
        System.out.println("-----------------------");
        List<Integer> list4 = new LinkedList<>();
        list4.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7));
        list4.removeIf(p -> p < 5);
        System.out.println(list4);//shortcut of the iterator


    }

}