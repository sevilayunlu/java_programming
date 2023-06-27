package day38_exceptions;

class CustomCheckedException extends Exception{

}
class UncheckedException extends RuntimeException{

}

public class CustomExceptions {

    public static void main(String[] args) {

        try {
            throw new CustomCheckedException();
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }
        System.out.println("--------------------------------------");

        throw new UncheckedException();







    }
}
