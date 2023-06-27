package Utilities;

import day31_inheritance.ProtectedAccessModifier;

public class Test3 extends ProtectedAccessModifier {//if it is the subclass , then the variables and methods of the parent class can be accessible.

    public static void main(String[] args) {
        System.out.println(ProtectedAccessModifier.a);
        ProtectedAccessModifier.method1();


    }


}
