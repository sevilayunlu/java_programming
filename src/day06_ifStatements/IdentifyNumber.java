package day06_ifStatements;

public class IdentifyNumber {
    public static void main(String[] args) {

        int number=-200;
        boolean isPositive= number>0;//if the number is greater than zero. Then, it is a positive number.
        boolean isNegative=  number<0;//if the number is less than zero. Then, it is a negative number.
        //boolean isZero=number==0;//if the number is equals to zero. Then, it is zero.
        boolean isZero= !isPositive && !isNegative;//if the number is not negative and not positive. Then, it is zero.

        System.out.println(number+ " is positive number: "+isPositive+"\n"+number+" is negative number: "+isNegative+
                "\n"+number +" is zero: "+isZero);





    }
}
/*
2. Create a class named IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false


 */