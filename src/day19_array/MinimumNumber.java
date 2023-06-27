package day19_array;

public class MinimumNumber {
    public static void main(String[] args) {
        int [] numbers ={100,20,500,40,-10,30};

        int min=numbers[0];//assume that the first element is the minimum number

        for (int i = 1; i < numbers.length; i++) {//i=1,2,3,4...

            if(numbers[i]<min){//compares the element of the array with the current min number
                min=numbers[i];//replace the current min number
            }

        }

        System.out.println("min= "+min);



    }
}
