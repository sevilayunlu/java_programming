package day37_exceptions;

public class TryCatchBlocks {
    public static void main(String[] args) {

        System.out.println("Program started");


        try {
            System.out.println(9 / 0);//(ArithmeticException))--an exception object created
            System.out.println("Try block");//this statement cannot be seen on the console because the exception is handled in the catch block
        } catch (
                ArithmeticException e) {//the parameter here must be able to refer to  the exception object  which is created  in the try block
            System.out.println("Catch Block");
        }


        System.out.println("Program1 ended");

        System.out.println("--------------------------------------");

        System.out.println("Program2 started");

        String str = null;

        try {
            System.out.println(str.toLowerCase());//unchecked exception
            System.out.println("Try block");
        } catch (RuntimeException e) {
            System.out.println("Catch block");
        }

        System.out.println("Program2 ended");

        System.out.println("----------------------------------");

        System.out.println("Program3 started");


        try {

            Thread.sleep(3000);
            System.out.println("Try block");//try block gets executed

        } catch (InterruptedException e) {
            System.out.println("Catch block");
        }

        System.out.println("Program3 ended");


    }
}
