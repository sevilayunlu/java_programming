package day07_IfStatements;

public class Grade {
    public static void main(String[] args) {



        char grade ='F';//we use 5 independent if statements and each will be checked during the run time.
        String result="";

        if(grade == 'A'){

            result="Excellent";
        }
        if(grade=='B'){
            result="Great Job";

        };
        if(grade=='C'){
            result= "Good";
        }

        if (grade== 'D'){
            result="Passed";
        }
        if(grade=='F'){
            result="Failed";
        }

        System.out.println(result
        );
    }
}


/*
2. Create a class named Grade, a char variable named grade is given. write a program to print the following messages:
            'A': Excellent
            'B': Great job
            'C': Good
            'D': Passed
            'F': Failed

        Note: Do not use more than one print statement

 */