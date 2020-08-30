package day48_Inheritance;

public class BofA {

    public static void main(String[] args) {
        BankAccount obj = new BankAccount("Aizhan", "Eric");
        obj.setAccountHolder( obj.firstName+" "+ obj.lastName);
        obj.setAccountNumber(123456789);
        obj.setBalance(50);

        obj.availablebalance();
        obj.deposit(500);
        obj.availablebalance();

        obj.withdraw(700);
        obj.withdraw(-200);
        obj.withdraw(0);
        obj.withdraw(300);

        System.out.println(obj);
    }
}
