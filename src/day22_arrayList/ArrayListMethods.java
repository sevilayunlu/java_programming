package day22_arrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();
        System.out.println(list);//[]


        list.add(10);//auto boxing
        System.out.println(list);//[10]

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);//[10, 10, 20, 30]

        list.add(1,15);//[10, 15, 10, 20, 30]
        System.out.println(list);

        list.add(2,25);//
        System.out.println(list);//[10, 15, 25, 10, 20, 30]
        System.out.println("---------------------------------------");


        ArrayList<String> studentList=new ArrayList<>();
        studentList.add("Mohammed");
        studentList.add("Abdurasul");
        studentList.add("Abidullah");
        studentList.add("Tatiana");


        System.out.println(studentList);//[Mohammed, Abdurasul, Abidullah, Tatiana]

        String firstStudent=studentList.get(0);
        System.out.println(firstStudent);//Mohammed

        String lastStudent=studentList.get(studentList.size()-1);
        System.out.println(lastStudent);//Tatiana






    }
}
