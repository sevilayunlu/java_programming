package day06_ifStatements;

public class GradeLevel2 {
    public static void main(String[] args) {

        int gradeLevel=16;
        String result=" ";//temporary value

        if(gradeLevel>=1 && gradeLevel <=5){
           result= " Elementary School";
        }

        if(gradeLevel>=6 && gradeLevel<=8){
            result=" Middle School";
        }
        if(gradeLevel>=9 && gradeLevel<=12){
           result="High School";
        }

        if(gradeLevel>=13&&gradeLevel<=16){
            result="College";
        }

        if(gradeLevel>=17 && gradeLevel<=18){
            result="Grad School";
        }

        System.out.println(result);


    }
}
/*

 int gradeLevel=16;

     if(gradeLevel>=1 && gradeLevel <=5){
         System.out.println(" Elementary School");
     }

     if(gradeLevel>=6 && gradeLevel<=8){
         System.out.println(" Middle School");
     }
     if(gradeLevel>=9 && gradeLevel<=12){
         System.out.println("High School");
     }

     if(gradeLevel>=13&&gradeLevel<=16){
         System.out.println("College");
     }

     if(gradeLevel>=17 && gradeLevel<=18){
         System.out.println("Grad School");
     }
 */