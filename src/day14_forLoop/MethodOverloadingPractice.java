package day14_forLoop;

public class MethodOverloadingPractice {

    public static void main(String[] args) {

        System.out.println(sum(10,20));
        System.out.println(sum(12,23,34));
        System.out.println(sum(12,23,23,23));
        System.out.println(sum(2.3,3.4,4.5));
        System.out.println(sum(10,29.4));
    }
    public static int sum(int n1, int n2){
        return n1+n2;
    }
    public static int sum(int n1, int n2, int n3){
        return sum(n1,n2)+n3;
    }
    public static int sum(int n1, int n2, int n3, int n4){
        return sum(n1,n2,n3)+n4;
    }
    public static double sum(double num1, double num2){
        return num1+num2;
    }
    public static double sum(double num1, double num2, double num3){
        return sum(num1,num2)+num3;
    }
    public static double sum(double num1, double num2, double num3, double num4){
        return sum(num1,num2,num3)+num4;
    }



}
//overloading a method:methods name mus be the same and the number or the type of the data must be different.