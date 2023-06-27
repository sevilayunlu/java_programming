package Utilities;


import day27_accessModifiers.AccessModifiers;
import day27_accessModifiers.Data;

public class Test {
    public static void main(String[] args) {

        System.out.println(Data.d);
        System.out.println(Data.e);
        System.out.println(Data.f);

        Data.method3();
        Data.method4();

        Data obj=new Data();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.method1();
        obj.method2();


        System.out.println("-------------------------");

        System.out.println(AccessModifiers.publicData);
        //System.out.println(AccessModifiers.protectedData); protected cannot always be accessible outside the package.
        // The prerequisite for the protected to be accessible within a different package is to create a subclass.
        //System.out.println(AccessModifiers.defaultData); default can never be accessed from a different package
        //System.out.println(AccessModifiers.privateData);//private can never be accessed

        new AccessModifiers();

        AccessModifiers.publicMethod();//only public is accessible within a different package



    }





}
