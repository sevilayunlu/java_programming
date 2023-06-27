package day31_inheritance;

class A{
    public int a=100;



}

public class FieldHiding extends A {

    public int a=300;//the variables have the same name and the one in the parent will not be inherited to the child class.


    public static void main(String[] args) {

        System.out.println(new FieldHiding().a);
    }
}
