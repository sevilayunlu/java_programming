package day04_concatenation;

public class PrimitiveTypeCastings {
    public static void main(String[] args) {
        //-----Implicit Casting--------

        byte a= 15;
        short b=(short)a;
        //short b=(short)a
        System.out.println(b);

        int c=a;//implicit casting
        long d= 3000l;
        float f=d;
       //-------Explicit Casting-------

        int x=100;
        byte y= (byte)x;

        float z= 28.8f;
        short q=(short)z;// z=28.8
        System.out.println(q);

        double n1=2.5;
        byte n2= (byte) n1;// n1 =2.5
        System.out.println(n2);

        System.out.println("--------------");

        int num =500;
        byte result= (byte) num;//This is explicit casting.

        System.out.println(result);

        int r=50000;
        short t= (short) r;
        System.out.println(t);
                ;
        double u= 3000.5;
        int p= (int) u;// This is explicit casting.
        System.out.println(p);

        int o=1000;
        double d1= o;
        System.out.println(d1);






    }
}
