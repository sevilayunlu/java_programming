package day11_String;

public class StringMethods3 {

    public static void main(String[] args) {
        String word= "";//true
       boolean r1= word.isEmpty();

        System.out.println(r1);
        //----------------------------------------
        String word1="       ";
        boolean r2=word1.isEmpty();//length=0
        boolean r3=word1.isBlank();
        System.out.println(r2);
        System.out.println(r3);
        //-----------------------------------------
        System.out.println("----------------------------");
        String str1="Cydeo";
        String str2=new String("Cydeo");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        String str3=new String("cydeo");
        System.out.println(str2.equals(str3));
        System.out.println("---------------------------");
        String s1="JAVA";
        String s2="java";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("----------------------------");
        String student= "Hasan Naran Sumeye Natalia";

        boolean hasAhmed=student.contains("Ahmed");
        System.out.println(hasAhmed);

        String sentence ="My favorite programming language is JAVA";
        System.out.println(sentence.toLowerCase().contains("java"));
        //-----------------------------------------------------------
        String name="Micheal";
        boolean l= name.startsWith("Da");
        System.out.println(l);

        String url="www.cydeo.com";
        boolean isValid=url.startsWith("www.");
        System.out.println(isValid);

        boolean t= url.endsWith(".com");
        System.out.println(t);

        //-----------------------------------------------------------

        String email="CydeoSchool@gmail.com";
        boolean isGmail=email.endsWith("gmail.com");
        boolean yahoo=email.endsWith("yahoo.com");
        boolean isHotmail=email.endsWith("hotmail.com");
        System.out.println("isGmail = " + isGmail);
        System.out.println("yahoo = " + yahoo);
        System.out.println("isHotmail = " + isHotmail);


    }
}
