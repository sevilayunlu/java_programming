package day16_nestedLoop;

public class NestedLoopPractice {

    public static void main(String[] args) {
      String str="aaabbccccccddeeeff" ;
      String result="";//"bdf"

        for (int j = 0; j <str.length() ; j++) {

            char ch=str.charAt(j);//each character of string str.
            int count=0;

            for (int i = 0; i <str.length() ; i++) {//responsible for comparing ch to each character of strand return the frequency

                if(str.charAt(i)==ch){
                    count++;
                }
            }
            if(count==2&&!result.contains(""+ch)){//if the result does not contain the character, add that to the result to avoid duplication
                result+=ch;
            }

        }


        System.out.println(result);


    }
}
