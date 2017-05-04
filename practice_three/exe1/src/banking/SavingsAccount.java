package banking;

/**
 * Created by java on 27/04/17.
 */
public class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(){

    }

    /*  擅做主张 interest_rate 把变为 interestRate*/

    public SavingsAccount(double balance,double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }
//    public  SavingsAccount(double balance, double interest_rate) {
//
//    }
}
