package day14_forLoop;

public class CheckPalindrome {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("Anna"));

    }

    public static boolean checkPalindrome(String str){


        String reverse="";
        for (int i = str.length()-1; i>=0; i--) {
            //int i=1;i<=str.length;i++
            reverse+=str.charAt(i);
        }
        boolean isPalindrome=str.equalsIgnoreCase(reverse);

        return isPalindrome;

    }

}
/*
Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true

 */