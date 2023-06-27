package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {

        //preincrement/decrement

        int x= 10;
        System.out.println(++x);//11
        System.out.println(x);

        int y= 100;
        System.out.println(--y);//99
        System.out.println(y);

        System.out.println("------------");

        //postincrement /decrement
        int a= 50;
        System.out.println( a++);//50
        System.out.println(a);//51

        int b= 25;
        System.out.println(b--);//25
        System.out.println(b);//24
        System.out.println("--------");
       int  n=30;
       int m = n++;
       System.out.println(m);
    }
}
