package day19_array;

public class MaxNum {
    public static void main(String[] args) {

        int [] numbers ={100,20,500,40,-10,30};

        int max=numbers[0];//assume that the first element is the maximum number

        for (int i = 1; i < numbers.length; i++) {//i=1,2,3,4...

            if(numbers[i]>max){//compares the element of the array with the current max number
                max=numbers[i];//replace the current max number
            }

        }

        System.out.println("max= "+max);


    }
}
/*


1. Write a program that can find the maximum number from an array
 */