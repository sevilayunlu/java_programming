package day26_statics;

public class IPhone {

    public static String brand="Apple";//static: all the iPhone objects' brand is Apple
    public String model;//instance:different models for iPhone objects
    public String color;
    public  double price;
    public static  String OS="IOS";//static: OS is the same for all iPhone objects
    public static String madeIn="China";
    public static boolean hasBattery=true;
    public static boolean isTouchScreen=true;
    public static boolean isExpensiveToFix=true;


   // public static void printPhoneInfo(){//static method only accepts statics
        /*System.out.println("Model: "+model);
        System.out.println("Color: "+color);*/

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public void printPhoneInfo(){//instance methods accept both statics and none-static
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Price: "+price);


    }
    public static void printOperatingSystem(){
        System.out.println("Operating system: "+OS);
    }















}
/*
Attributes:
brand,model,color,price,OS,madeIn,hasBattery
*/