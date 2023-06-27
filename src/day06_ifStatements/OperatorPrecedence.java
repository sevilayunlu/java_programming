package day06_ifStatements;

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(5+2*3);
        //5+6
        System.out.println(7+3-2/2);
        //7+3-1
        System.out.println(-5+3);

        System.out.println(10>9==8<7  && "java"=="Phython"|| 'a'=='A');
        //                true==false
        //                  false     &&  false            || false
        //                   false  || false
        //                    false

        int a=20;
        a += 10+2*3;
        //a +=10+6
        System.out.println(a);

    }
}
