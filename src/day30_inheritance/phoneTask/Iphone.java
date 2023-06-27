package day30_inheritance.phoneTask;

public class Iphone extends Phone {//Iphone Is A phone.It gives an error. Because we hve not called the constructor.If the constructor is default, there is no need to call it explicitly, however, if it is a parameritized constructor
    // , we need to call the constructor explicitly.

    public Iphone(String model, String size, double price, String color) {
        //the rules to call constructors are also valid for the super keyword
        super("Apple", model, size,  color,price);
    }


    //public Iphone(String model, String size, double price, String color){//we do not need to add the brand as an argument because it will always be Apple.
    //super("Apple", model, size, price, color);
    //}
    public static boolean hasApplePay = true;


    public void facetime(long phoneNumber) {
        System.out.println(getModel()+" is face timing with "+phoneNumber);

    }

    public void faceTime(String email) {
        System.out.println(  getModel()+" is face timing with "+email );

    }


}
/*
2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)





 */