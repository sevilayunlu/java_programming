package day12_customMethods;

public class CustomMethodsWithParametersPractice {
    public static void main(String[] args) {

        maxNum(100000,5000);
        System.out.println("-------------------");
        maxNum(2.3,6.7);
        System.out.println("-------------------");
        maxNum(-244,-356);
        System.out.println("-------------------");
        initial("Mohammed", "Karim");
        System.out.println("--------------------");
        initial("Hasan", "Ayhan");
        System.out.println("--------------------");
        eligibility(34);
        System.out.println("--------------------");
        oddEvenOrZero(45);
        oddEvenOrZero(0);
        oddEvenOrZero(24);
        System.out.println("----------------------");
        score(47);

    }

//create a method that can print the maximum number between two numbers, if both are equal then it prints "Equal"(num2,num2)

    public static void maxNum(double num1, double num2){
        if(num1>num2){
            System.out.println(num1+ " is the maximum number");
        }else if(num2>num1){
            System.out.println(num2+ " is the maximum number");
        }else{
            System.out.println("Equal");
        }

    }


//create a method that can display the initials of a person(firstname and lastname)
    public static void initial(String firstName, String lastName){
        String initial=firstName.charAt(0)+"."+lastName.charAt(0);
        System.out.println("initial is "+initial);

    }
    //create a method that can check if a person is eligible to buy alcohol(age)
    public static void eligibility(int age){
        if(age>=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("You aren not eligible to buy alcohol");
        }


    }
// create a method that can check if a number is odd,even,zero(number)
    public static void oddEvenOrZero(int number){
        if(number==0){
            System.out.println(number+" is zero");
        }else if(number%2==0){
            System.out.println(number+" is even");
        }else{
            System.out.println(number+" is odd");
        }
    }
//create a method that can calculate the grade of the students(score)
    public static void score(int num){
        String result = "Your score is ";
        if (num >= 90) {// false: score<90
            result += "A";
        } else if (num >= 80 ) {//false: score<80
            result += "B";

        } else if (num >= 70 ) {//false:score<70
            result += "C";
        } else if (num >= 60) {//false: score<60
            result += "D";
        } else {//score<60
            result += "F";
        }
        System.out.println(result);
    }




}


