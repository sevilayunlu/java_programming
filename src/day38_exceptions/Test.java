package day38_exceptions;

import Utilities.Library;

import java.time.LocalTime;

public class Test {
    public static void main(String[] args) {


        System.out.println("Hello Cydeo");
        //Thread.sleep(3500);

        Library.sleep(3.5);

        System.out.println("How are you today?");

        System.out.println("---------------------------");

        if(LocalTime.now().equals(LocalTime.of(4,0))){
            throw new BreakTimeException();
        }

        throw new BreakTimeException("Time to go home");

    }
}
