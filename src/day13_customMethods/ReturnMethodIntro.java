package day13_customMethods;

public class ReturnMethodIntro {


    public static void main(String[] args) {

        //int total= sum(20,40);// sum is  avoid method,cannot be treated as a data.It does not return any data
          int total= addition(10,20);
           int t= square(10);
        System.out.println(square(10));

        System.out.println(cube(5));
    }

   /* public static void sum(int num1, int num2){

        int result= num1+num2;// result cannot be used outside the method
        System.out.println(result);*/



    public static int addition(int n1, int n2){

        int result=n1+n2;
        return result;

    }
    public static int square(int number){

        int result=number*number;
        return result;
    }
    public static int cube(int number){
        int cube=square(number)*number;
        return cube;



    }

    }



