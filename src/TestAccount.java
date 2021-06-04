/*Samuel Julien
* Lab 3
* 9-18-17*/
public class TestAccount {
    public static void main(String[]args){
        Account acc = new Account(1122,20000,.045);
        acc.withdraw(250);
        acc.deposit(3000);
        System.out.print(acc);
        //Savings Account
        Account acc2 = new SavingsAccount(1125, 20000,.045,0);
        acc2.withdraw(25000);
        acc2.deposit(3000);
        System.out.print(acc2);
        //Checking Account
        Account acc3 = new CheckingAccount(1126, 20000,.045,500);
        acc3.withdraw(20400);
        acc3.deposit(3000);
        System.out.print(acc3);
    }
}

