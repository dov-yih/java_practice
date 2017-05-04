package banking;

/**
 * Created by java on 27/04/17.
 */
public class CheckingAccount extends Account {
    private double overdraftProtection;

    public CheckingAccount(){

    }

    public CheckingAccount(double balance) {
        super(balance);
    }

    public CheckingAccount(double balance ,double protect) {
        super(balance);
        this.overdraftProtection = protect;
    }

    public boolean withdraw(double amt) {
//    	System.out.println(overdraftProtection);
//        System.out.println(this.balance);
        boolean result = true;
        if(this.balance >= amt){
            this.balance -= amt;
            result = true;
        }else if(amt - this.balance - overdraftProtection > 0){
            result = false;
        }else{
            amt -= this.balance;
            this.balance = 0;
            this.overdraftProtection -= amt;
        }
//        System.out.println(this.balance);
        return result;
    }
}
