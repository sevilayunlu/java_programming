package day07_IfStatements;

public class GradeLevel {
    public static void main(String[] args) {

        int gradeLevel=6;//1-18
        String result="";
        if (gradeLevel<=5){//false: gradeLevel>5==gradeLevel>=6

            result="Elementary School";
        }
        else if ( gradeLevel<=8){//false:gradeLevel>=9
            result="Middle School";
        }
        else if(gradeLevel<=12){
            result="High School";//false:gradeLevel>=13
        }
        else if(gradeLevel<=16){//false:gradeLevel>=17

            result="College";//false: gradeLevel>=18
        }else{

            result="Grad School";
        }

        System.out.println(result);

    }
}
/*
1. Create a class named GradeLevel.java
2. An integer variable named gradeLevel is declared and given, Write
a program to determine and print which school type someone is in
Ex:
gradeLevel = 2
output:
Elementary School
The grade level and types are:
1 ~ 5: Elementary school
6 ~ 8: Middle school
9 ~ 12: High school
13 ~ 16: College
17 ~ 18: Grad School
Assume that the given number is 1 ~ 18
 */