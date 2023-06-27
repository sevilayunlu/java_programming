package day18_garbageCollection;

public class TestBankAccountObjects {
    public static void main(String[] args) {
        BankAccount obj1 = new BankAccount();
        obj1.setInfo("Gadir", 1276636);
        System.out.println(obj1);


        obj1.deposit(1000);
        obj1.checkBalance();


        obj1.withdraw(700);
        obj1.checkBalance();


        obj1.deposit(2200);
        obj1.checkBalance();
        obj1.withdraw(50000);
        obj1.checkBalance();
        System.out.println("--------------------------------");

        BankAccount account1=new BankAccount();
        BankAccount account2=new BankAccount();

        account1.setInfo("Sebastian",573794);
        account2.setInfo("Umran",2672728);
        account1.deposit(5000);
        account1.checkBalance();
        account2.deposit(1000);
        System.out.println(account1);
        System.out.println(account2);






    }
}
