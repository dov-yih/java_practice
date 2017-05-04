package banking;

/**
 * Created by java on 27/04/17.
 */
public class Account {
    protected double balance;

    public Account(){

    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public boolean deposit(double amt) {
        this.balance += amt ;
        return true;
    }

    public boolean withdraw(double amt) {
        boolean result = true;
        if(this.balance < amt)
            result = false;
        else
            this.balance -= amt;
        return result;
    }
}
