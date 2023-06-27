package day14_forLoop;

public class SumOfDigits {

    public static void main(String[] args) {

        System.out.println(sumOfDigits("r56z7u8i9"));



    }
    public static int sumOfDigits(String str){
        int sum=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch=str.charAt(i);
            if (Character.isDigit(ch)){//???????
                sum+=ch-48;
            }

        }

                return sum;



    }
}
/*
Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3

                 output:    6

             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1

 */