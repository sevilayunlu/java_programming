package day32_finalKeyword;

import day27_accessModifiers.CydeoStudent;

import java.time.LocalDate;


class Student {//if we need to make a class a parent class we should never use the final keyword.
    public final void language() {//when we make this method final, it can still be inherited to the subclasses, but it cannot be overridden.
        System.out.println("Java Programming");
    }
}

public class FinalKeyword extends Student {//it gives compile error because we have made the class immutable by the final keyword.String class which is placed in the java.lang package is also immutable
    // and if we try to extend a class to the string class it gives compile error.


    // public void language(){//when we try to override, it gives compile error. because we used final keyword in the parent class for this method.
    // System.out.println("Python Programming");
    //}


    //public final FinalKeyword(){//we cannot apply the final keyword to the constructors.}


    public static void main(String[] args) {

        final char gender = 'M';//M
        System.out.println(gender);

        // gender='F';//a new value is stored into the variable.If we try to use it for the second time, it gives compile error
        // because we already used the final keyword and assigned a value.The value cannot be changed anymore.
        // System.out.println(gender);//F

        System.out.println("------------------------");

        final LocalDate dateOfBirth = LocalDate.now();

        // dateOfBirth=dateOfBirth.plusYears(1);
        System.out.println(dateOfBirth);
        System.out.println("--------------------------");

        new FinalKeyword().language();
        new Student().language();

         final String name="James";//if we make the reference variable final, we can prevent it to be eligible for the garbage collection
        //name=null;--eligible for the garbage collection
        //name="Daniel";--eligible for the eligible connection --"James"

        System.out.println(name);





    }
}
