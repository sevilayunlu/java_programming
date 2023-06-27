package day37_exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        try{
            System.out.println(9/0);
        }catch(RuntimeException e){
            System.out.println("Run time exception has been caught");
            e.printStackTrace();
            System.exit(1);//the only way of stopping the execution of finally block but there is no point of terminating the program before the finally block.
        }finally {//if we have a code block which must be executed regardless of that the exception is handled or not handled, we can use finally block.
            System.out.println("Finally block");
        }


















    }
}
