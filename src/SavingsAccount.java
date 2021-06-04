/*Samuel Julien
* Lab 3
* 9-18-17*/
public class SavingsAccount extends Account {
    double overdraftLimit = 0;

    public SavingsAccount() {
    }

    public SavingsAccount(int ID, double balance, double annualInterestRate, double overdraftLimit) {
        super(ID, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw (double w) {
        if (((getBalance() - w) < overdraftLimit)) {
            System.out.println(" \ninsufficient funds!");
        } else{
            System.out.println();
            setBalance(getBalance() - w);};
    }
}