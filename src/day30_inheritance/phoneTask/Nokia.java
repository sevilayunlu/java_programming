package day30_inheritance.phoneTask;

public class Nokia extends Phone {

    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, color,price);
    }


    // public void method(){- a regular method cannot call the super keyword
    //super()
    //}

    public void selfDefense() {
        System.out.println(getBrand() + " " + getModel() + " can be used for self defense");

    }


}
/*
2.3 Nokia:
					Extra methods:
						selfDefense()

*/