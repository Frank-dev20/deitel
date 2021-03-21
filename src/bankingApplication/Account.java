package bankingApplication;

public class Account {
    double balance;

    public void depositMoney(double amount) {
        if(amount>=0){
        balance = balance+ amount;
        }
    }

    public double getAccountBalance() {
        return balance;
    }
}
