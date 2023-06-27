package day06_ifStatements;

public class OddorEven {

    public static void main(String[] args) {


int number=45;

boolean isEven= number%2==0;//when we divide a number by 2, the remainder should be 0.in that case the number is an even number.
//boolean isOdd=  number%2 !=0  ;//when we divide the number by 2, the remainder is not 0, that means the number is odd.

boolean   isOdd=!isEven;   //if the number is not even, then it is odd.

        System.out.println(number+ " is an even number:"+isEven+"\n"+number +" is an odd number:"+isOdd);


    }
}
/*
1. Create a class named OddOrEven, and write a program that can identify if the given number is odd or even
			Ex:
				number = 20

			output:
				20 is an even number: true
				20 is an odd number: false

		Hint: even numbers are the numbers that are evenly divisible by 2 (remainder is zero)


 */