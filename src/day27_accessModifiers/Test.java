package day27_accessModifiers;

public class Test {

    public static void main(String[] args) {
       // new StaticInitializationBlock();
        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

//Static variables should not be initialized within constructor.The execution of the constructor depends on objects
// and the variables will get executed as many as the constructor gets executed.
// That is not an efficient way to execute the static variables the value of which are always the same.
// No need to execute them separately for every single object within a constructor.
// If the variable can be set just in one step, it can be assigned to a value right away.
// However, sometimes, we may need several steps to set the variable and static block is created exactly for this purpose.
//Constructor is used to initialize the instances and the static is used to initialize the static members of a class.

        System.out.println("-------------------------------");

        System.out.println(AccessModifiers.publicData);//public is accessible within the same package
        System.out.println(AccessModifiers.protectedData);//protected is also accessible within the same package
        System.out.println(AccessModifiers.defaultData);//default can be accessed within the same package
       // System.out.println(AccessModifiers.privateData);//private cannot be accessed within a different package

        new AccessModifiers();
        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
    }
}
