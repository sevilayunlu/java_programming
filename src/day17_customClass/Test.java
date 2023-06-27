package day17_customClass;

public class Test {
    public static void main(String[] args) {

        String name1="Ermek";
        String name2="Entisar";
        String name3="Mohammed";


        System.out.println(name1);
        System.out.println(name2.toUpperCase());


        String name="  chuck norris";
        String result=name.trim().toUpperCase();
        String initials=result.substring(0,1)+"."+result.substring(result.indexOf(" ")+1,result.indexOf(" ")+2)+".";
        System.out.println(initials);



    }

}
