package day26_statics;

public class ConstructorCalls2 {
    public ConstructorCalls2(){//Default
        System.out.println("Default");
    }

    public ConstructorCalls2(int a){//Default, because it calls the first default constructor.Then, executes the remaining code fragment
        this();//calling the default constructor
        System.out.println("int arg");
    }
    public ConstructorCalls2(String a){//Default,int arg,String arg
        this(4);//calling the constructor with int arg
        System.out.println("String arg");
    }

 /*
  to be able to call more than one constructor will help to create the objects.We can chain the constructors.

*/
 public static void main(String[] args) {

     ConstructorCalls2 abj1=new ConstructorCalls2();
     System.out.println("-----------------------------");
     ConstructorCalls2 obj2= new ConstructorCalls2(10);
     System.out.println("-----------------------------");
     ConstructorCalls2 obj3= new ConstructorCalls2("Java");









 }










}
