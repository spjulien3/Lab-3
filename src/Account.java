/*Samuel Julien
* Lab 3
* 9-18-17*/
import java.util.Date;
public class Account {
    private int ID;
    private double balance;
    private double annualInterestRate;
    private java.util.Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }

    public Account(int ID, double balance, double annualInterestRate) {
        this.ID = ID;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dateCreated = new Date();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public java.util.Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return getAnnualInterestRate()/12;
    }
    public double getMonthlyInterest(){
        return getMonthlyInterestRate()* balance;
    }
    public void withdraw (double n){
       balance-=n;
    }
    public double deposit (double d){
        balance=balance+d;
        return balance;
    }
    public String toString(){
        return "The account ID is: "+ID+"\nThe balance is: "+ balance+"\nThe monthly interest is: "+getMonthlyInterest()+"\nCreated: "+dateCreated;
    }

}

