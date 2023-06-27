package day08_ternary_switch;

public class SwitchIntro {

    public static void main(String[] args) {

        char grade= 'q';
        /*
       A: Excellent
       B: Great Job
       C: Good
       D: Passed
       F: Failed
       */
        switch (grade){


            case 'B':
                System.out.println("Great Job");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'A':
                System.out.println("Excellent");
                break;

            case 'D':
                System.out.println("Passed");
                break;
            default:
                System.out.println("invalid");
                break;

            case 'F':
                System.out.println("Failed");
                break;





        }




    }


}
