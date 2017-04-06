/**
 * Created by yidafu on 17-4-6.
 */
public class Student {
    private String sNo;
    private String sName;
    private String sGender;
    private int sAge;
    private double sJavaGrade;

    public Student() {
        this.sNo = "0000";
        this.sName = "Name";
        this.sGender = "Gender";
        this.sAge = 0;
        this.sJavaGrade = 60.0;
    }

    public Student(String sNo,String sName,String sGender,int sAge,double sJavaGrade){
        this.sNo = sNo;
        this.sName = sName;
        this.sGender = sGender;
        this.sAge = sAge;
        this.sJavaGrade =sJavaGrade;
    }

    public String getSNo() {
        return this.sNo;
    }

    public String getSName() {
        return this.sName;
    }

    public String getSGender() {
        return this.sGender;
    }

    public int getSAge() {
        return this.sAge;
    }

    public double getSJavaGrade() {
        return this.sJavaGrade;
    }
}
