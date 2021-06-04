/*Samuel Julien
* Lab 3
* 9-18-17*/
public class CheckingAccount extends Account{
    double overdraftLimit = 0;

    public CheckingAccount() {
    }

    public CheckingAccount(int ID, double balance, double annualInterestRate, double overdraftLimit) {
        super(ID, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    @Override

    public void withdraw (double w) {
        if (((getBalance() - w) < overdraftLimit)) {
            System.out.println("\n Over Limit!");
        } else{
            System.out.println();
            setBalance(getBalance() - w);};
    }
}

