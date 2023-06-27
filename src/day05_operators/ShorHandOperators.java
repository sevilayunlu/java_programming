package day05_operators;

public class ShorHandOperators {

    public static void main(String[] args) {


        int a=20;
        System.out.println(a);//20
        System.out.println(a);//20

        a= 40;
        System.out.println(a);
        a=90;
        System.out.println(a);
        System.out.println("-------------------------");

        double balance= 100.0;
        balance+=1000.0;// balance will be reassigned to
                       // the old value+the value that i added on top of that.
        balance+=500;
        balance+=10000;
        System.out.println(balance);
        System.out.println("------------------------");

        balance-= 1000; //balance =11600-1000
        balance-=5000;

        System.out.println(balance);

        System.out.println("-----------");

        double salary= 45000;
        salary*=2;
        salary*=3;

        System.out.println(salary);
        System.out.println("-------------------");
        double eth= 4;
        eth*=250;
        System.out.println(eth);

        salary/=2;
        System.out.println(salary);
        System.out.println("------------------");
        int b=39;
        b%=7;
        System.out.println(b);





    }
}
