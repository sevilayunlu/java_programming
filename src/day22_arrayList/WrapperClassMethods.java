package day22_arrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {

        String str="20";
        System.out.println(str+1);

        int num1=Integer.parseInt(str);

        Integer num2=Integer.valueOf(str);
        System.out.println(num2);
        System.out.println("--------------------------------");

        String s="20.5";
        double num3=Double.parseDouble(s);//returns primitive double
        System.out.println(num3);
        Double num4=Double.valueOf(s);//return wrapper class object
        System.out.println(num4);
        System.out.println("----------------------------------");
        String x="true";
        boolean a=Boolean.parseBoolean(x);
        Boolean b=Boolean.valueOf(x);

        System.out.println(a);
        System.out.println(b);
        System.out.println("----------------------------------");


        char ch='$';
        boolean isDigit=Character.isDigit(ch);
        System.out.println("isDigit = " + isDigit);

        boolean isLetter=Character.isLetter(ch);
        System.out.println("isLetter = " + isLetter);

        boolean isLower=Character.isLowerCase(ch);
        System.out.println("isLower = " + isLower);

        boolean isUpper=Character.isUpperCase(ch);
        System.out.println("isUpper = " + isUpper);

        boolean isSpecial=!Character.isLetterOrDigit(ch);
        System.out.println("isSpecial = " + isSpecial);

        String string="a1b2c3d44e5";
        int sum=0;

        for (char each : string.toCharArray()) {
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }

        System.out.println("sum = " + sum);




    }
}
