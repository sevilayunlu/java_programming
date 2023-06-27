package day27_accessModifiers;

public class AccessModifiers {

   public static  int publicData=200;
   protected static int protectedData=300;
   static int defaultData=400;
   private static int privateData=500;

public AccessModifiers(){

   }
   public static void publicMethod(){
      System.out.println("public");
   }
 protected static void protectedMethod(){
    System.out.println("protected");

   }
   static void defaultMethod(){
      System.out.println("default");

   }
   private static void privateMethod(){
      System.out.println("private");

   }



   public static void main(String[] args) {


      System.out.println(publicData);//public is accessible within the same class
      System.out.println(protectedData);//protected is accessible within the same class
      System.out.println(defaultData);//default access modifier is always accessible within the same class
      System.out.println(privateData);//private access modifier is accessible within the same class.It cannot be accessed in any other places.


      new AccessModifiers();

      publicMethod();
      protectedMethod();
      defaultMethod();
      privateMethod();


   }
}
