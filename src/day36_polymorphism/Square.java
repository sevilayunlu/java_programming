package day36_polymorphism;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }


    public boolean equals(Object obj) {
        if (!(obj instanceof Square)) {
            System.err.println("Invalid object. Object must be square");
            System.exit(1);
        }
        if (side == ((Square) obj).side) {//we need to do down casting here, because after the first condition is executed as true,
                                          // that means we have an object reference and this reference does not have the side variable. To be able to reach the features of the Square,
                                          //we have to do down casting
            return true;
        }

        return false;
    }


}
