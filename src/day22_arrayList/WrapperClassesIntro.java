package day22_arrayList;


public class WrapperClassesIntro {
    public static void main(String[] args) {


        String str="Java";
        int a=10;
        Integer a2=a;
        System.out.println(a2);
        System.out.println("--------------------");

        int b1=100;
        Integer b2=b1;//autoboxing//only the related wrapper class can be assigned

        double c1=b1;//implicit casting
        long c2=b1;

        char ch='A';

        Character ch2=ch;

        double d1=5.5;

        Double d2=d1;//auto boxing
        System.out.println("-------------------");

        Integer n1=20;
        int n2=n1;//unboxing: use always its own primitive
        //long n3=n1;
        //double n4=n1;
        Character e1='Z';
        char e2=e1;
        //int e3=e1;
        //long e4=e1;














    }
}
