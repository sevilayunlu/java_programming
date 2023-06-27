package day30_inheritance.phoneTask;

public class TestPhoneObjects {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "Large", 1000.5, "Black");
        Samsung samsung = new Samsung("Galaxy S22", "Medium", 1100, "White");
        Nokia nokia = new Nokia("Brick", "Small", 50, "Pink");

        iphone.call(911);
        samsung.call(911);
        nokia.call(911);

        iphone.text(91156567);
        samsung.text(911546456);
        nokia.text(9113454);

        iphone.facetime(121723);
        //samsung.facetime(1287323);
        //nokia.facetime(234234);


        samsung.freeze();
        //iphone.freeze();
       // nokia.freeze();

        nokia.selfDefense();
        //iphone.selfDefense();
        //samsung.selfDefense();


        System.out.println("-----------------------");
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);



    }


}
