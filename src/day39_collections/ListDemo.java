package day39_collections;



import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();//array based class. That means that retrieving the element is faster
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.get(0);//get() is faster


        List<Integer> linkedList = new LinkedList<>();//node based class(doubly linked list).
        // That means that adding and deleting the elements is faster== add(), addAll(), remove(), removeAll(), retain()

        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);
        linkedList.remove(0);

        linkedList.get(0);

        System.out.println("----------------------------------------------");

        Vector<Integer> vector=new Vector<>();
        vector.add(100);
        vector.add(200);
        vector.add(300);
        vector.add(400);

        vector.get(0);

        System.out.println("-----------------------------------------");

        Stack<Integer> stack=new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);
        stack.add(400);
        System.out.println(stack);

        int lastElement=stack.pop();
        System.out.println(stack);

        int secondLastElement=stack.pop();
        System.out.println(secondLastElement);











    }
}
