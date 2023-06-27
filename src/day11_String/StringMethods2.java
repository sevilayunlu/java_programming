package day11_String;

public class StringMethods2 {

    public static void main(String[] args) {

        String sentence = "I love Python, Python is the best programming language and Python is in high demand";
        sentence = sentence.replace("Python", "Java");//lastly. sentence is here reassigned.
        System.out.println(sentence);
        //----------------------------------------------------------
        String word = "java";
        //word=word.replace('a','e');//jeve

        word = word.replace("a", "e");
        System.out.println(word);
        //-----------------------------------------------
        String sentence2 = " I love Java, Java is cool.";
        //sentence2= sentence2.replace("Java","Python");
        System.out.println(sentence2);

        sentence2 = sentence2.replaceFirst("Java", "Python");//replaces just the first matching value.
        System.out.println(sentence2);
        //-------------------------------------------
        String sentence3 = "Java is fun, Java is cool, Java is amazing";
        //sentence3=sentence3.replace("Java","Python");
        sentence3 = sentence3.replaceFirst(", Java", ", Python");//by specifying the value, second or third matching values can also be replaced.
        System.out.println(sentence3);
        //-------------------------------------------
        String sentence4 = "I love Java Programming";
        String languageName = sentence4.substring(7, 10 + 1);//7+11
        System.out.println(languageName);
        //---------------------------------------------
        String sentence5="Today is Sunday, Tomorrow is Monday";
        //                0123456789....14
        String today =sentence5.substring(9,14+1);
        System.out.println(today);
        //---------------------------------------------
        String email="CydeoSchoolJavaProgramming@yahoo.com";
        int beginning=email.indexOf('@')+1;
        int ending=email.lastIndexOf('.');

        String domain=email.substring(beginning,ending);

        System.out.println(domain);
        //---------------------------------------------
        String sentence6="I love Java Programming";

        String r1= sentence6.substring(7);
        System.out.println(r1);
        //---------------------------------------------
        String sentence7= "Today is Sunday,Tomorrow is Monday";
        String tomorrow=sentence7.substring(sentence7.lastIndexOf(' ')+1);
        System.out.println(tomorrow);
        //---------------------------------------------
        String sentence8="I study at Cydeo School";
        String schoolName=sentence8.substring(11);
        System.out.println(schoolName);
        //--------------------------------------------
        System.out.println("----------------------------------");
        String str="Python";
        String result=(str+"\n").repeat(10);
        System.out.println(result);





    }
}
