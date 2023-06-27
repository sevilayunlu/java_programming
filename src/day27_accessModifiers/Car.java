package day27_accessModifiers;

public class Car {
    public String make,model,color;
    public int year;
    public double price;

    public static int wheels=4;

    public class CarEngine{//nested class. It is correlated with Car class. Engine is the inner class and car is the outer class.
        public void method(){
            System.out.println(make);
            System.out.println(wheels);
        }

    }

   public static class StaticInnerClass{


       public static void main(String[] args) {

          // System.out.println(make);  -because the inner class is static, it does not accept instance variables
           System.out.println(wheels);
       }



   }





}
