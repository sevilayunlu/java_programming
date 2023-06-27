package day25_constructor;

public class ConstructorsIntro {
    public ConstructorsIntro(){
        System.out.println("Object is created by using no argument constructor");
    }




   public ConstructorsIntro(int a){
       System.out.println("Object is created by using int argument constructor");

   }




    public void add(){

    }

    public static void main(String[] args) {

        ConstructorsIntro obj1=new ConstructorsIntro(223);
        ConstructorsIntro obj2=new ConstructorsIntro(45);
        ConstructorsIntro obj3=new ConstructorsIntro(67);




    }










}
