package day37_exceptions;

import day35_polymorphism.transportationTask.Car;

public class MultiCatchBlock {
    public static void main(String[] args) {

        Car car=null;
        try{
            car.drive();
        }catch (ArithmeticException e){
            System.out.println("First catch block");
            e.printStackTrace();
        }catch(ClassCastException e){
            System.out.println("Second catch block");
            e.printStackTrace();
        }catch(NullPointerException e){
            System.out.println("Third catch block");
            e.printStackTrace();
        }catch (IndexOutOfBoundsException e){
            System.out.println("Fourth catch block");
        }catch (RuntimeException e){//cannot be placed before the subclasses
            System.out.println("Fifth catch block");
            e.printStackTrace();
        }


        System.out.println("Program1 ended");






    }

}
