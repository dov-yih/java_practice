/**
 * Created by java on 04/05/17.
 */
public class Staff {
    private int jobNumber;
    private String name;
    private String department;
    private int selary;

    public Staff(){}

    public Staff(int jobNumber,String name,String department,int selary) {
        this.jobNumber  = jobNumber;
        this.name       = name;
        this.department = department;
        this.selary     = selary;
    }


    public String getName() {
        return this.name;
    }

    public int getSelary() {
        return this.selary;
    }

    public String getDepartment() {
        return this.department;
    }
    //  私自将 changPay()变为 changeSelary()
    public void changeSelary(int selary) {
        System.out.println(this.selary);
        this.selary = 1500;
    }
    public void changeSelary(float selary) {
        if(this.selary < 2000)
            this.selary *=1.2;
    }
}
