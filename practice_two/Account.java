/**
 * Created by yidafu on 17-4-6.
 */
public class Account {
    private int id;
    private double balance;
    private double annualRate;
    private String dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0.0;
        this.annualRate = 0;
        this.dateCreated = "2017-4-6";
    }

    public Account(int id,double balance,double annualRate) {
        this.id = id;
        this.annualRate = annualRate;
        this.balance = balance;
        this.dateCreated = "2017-4-6";
    }

    public void setId(int id){
        this.id = id;
    }

    public void setAnnualRate(double annualReate){
        this.annualRate = annualReate;
    }

    public void setBalace(double balance){
        this.balance  = balance;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualRate() {
        return annualRate;
    }

    public String getDateCreated() {
        return this.dateCreated;
    }

    public String getNonthlyRate() {
        return this.annualRate/12 +"%";
    }

    public String withDraw(double money) {
        this.balance -= money;
        if(this.balance <= 0) {
            this.balance += money;
           return "余额不足";
        }
        return "取钱成功";
    }

    public void deposit(double money) {
        this.balance += money;
    }

    public String getInfo() {
        return "余额：" + this.balance + ",月利率：" + this.getNonthlyRate() + ",日期：" + this.dateCreated;
    }
}
