package day25_constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterIntro {


    public static void main(String[] args) {

        DateTimeFormatter df=DateTimeFormatter.ofPattern("MMMM-dd-y,EEEE");

        LocalDate today= LocalDate.now();
        System.out.println(today.format(df));
        System.out.println("---------------------------");

        LocalDate date1= LocalDate.of(2022,7,1);
        System.out.println(date1.format(df));
        System.out.println("----------------------------");

        DateTimeFormatter tf=DateTimeFormatter.ofPattern("h:m a");//with the upper case H, we do not have to  add  a symbol for am and pm
        LocalTime time1=LocalTime.of(17,5);
        System.out.println(time1.format(tf));
        System.out.println("----------------------------");

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("EEEE,MMM/dd/y hh:mm a");//only the specific letters can be used.
        LocalDateTime starts=LocalDateTime.now();
        System.out.println(starts.format(dtf));
        System.out.println("------------------------------");

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("EEEE, h:mm a, MMM/d/y");
        LocalDateTime ends=LocalDateTime.of(2020,11,24,1,0);
        System.out.println(ends.format(dtf1));






/*
 use the LocalDateTime get the date and time in the following format:
            Tuesday, 1:00 pm, Nov/24/2020




 */





    }
}
