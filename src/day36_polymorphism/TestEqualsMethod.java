package day36_polymorphism;

public class TestEqualsMethod {

    public static void main(String[] args) {

        Circle circle1=new Circle(5);
        Circle circle2=new Circle(5);

        System.out.println(circle1==circle2);//compares the memory allocation and returns false
        System.out.println(circle1.equals(circle2));
        System.out.println("--------------------------");

        Iphone iphone1=new Iphone("Apple","Iphone 12", "Medium", "Blue",900);
        Iphone iphone2=new Iphone("Apple","Iphone 12", "Medium", "Black",900);
        //System.out.println(iphone1.equals(circle1));
        System.out.println(iphone2.equals(iphone1));



    }
}
