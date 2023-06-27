package day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {

            if (i == 4) {
                continue;//provides skipping the related iteration
            }
            System.out.println(i);
        }

        System.out.println("------------------------");

        for (int i = 10; i < 21; i++) {

            if(i%2==0){//odd numbers btw 10 and 20
                continue;
            }
            System.out.println(i);

        }

        System.out.println("-----------------------------");
        for (char  i = 'A'; i <='G' ; i++) {

            if(i=='B'||i=='E'){
                continue;}
                System.out.println(i);
        }
        System.out.println("-------------------------------");
        for (int i = 0; i <10 ; i++){
            System.out.println("Hello World");
            System.out.println("Hello Cydeo");}

        System.out.println("--------------------------------");


        for (int i = 50; i < 101; i++) {
            if(i%2==0){
                System.out.print(i+" ");

            }

        }
        System.out.println();
        for (int i = 50; i < 101; i+=2) {
            System.out.print(i+" ");

        }
        System.out.println();
        for (int i =50; i <101 ; i++) {
            if(i%2!=0){
                continue;
            }
            System.out.print(i+" ");
        }

}
}
