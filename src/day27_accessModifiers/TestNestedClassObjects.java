package day27_accessModifiers;



public class TestNestedClassObjects {

    public static void main(String[] args) {//in java, only the inner class can be static,
        // other classes can never be static.

        Car obj1=new Car();//Car object

        Car.CarEngine obj2=obj1.new CarEngine();//CarEngine object

        Car.StaticInnerClass obj3= new Car.StaticInnerClass();//can be called thorough the class name because the inner class is static


    }
}
