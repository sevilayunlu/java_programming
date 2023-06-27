package day27_accessModifiers;

public class TestCircleObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(7);
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

       /* System.out.println(circle1.pi);
        System.out.println(circle2.pi);
        System.out.println(circle3.pi);
        the result will be the same for each object.
         Class cannot share what the object has
         but the object can access the variables or methods of the class.

         The right way to call the statics is calling them thorough the class name
       */
        System.out.println(Circle.pi);


    }
}
