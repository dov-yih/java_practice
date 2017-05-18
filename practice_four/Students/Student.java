package Students;

/**
 * Created by yidafu on 2017/5/18.
 */
public class Student {
    private String name;
    private String klass;
    private String subject;
    private int grade;

    public Student() {}

    public Student(String name,String klass,String subject,int grade) {
        this.name = name;
        this.klass = klass;
        this.subject = subject;
        this.grade = grade;
    }
    public String getInfo() {
        return name;
    }
    public int hashCode(){
        int hashcode = Integer.parseInt(this.name.hashCode() + "" + this.grade);
        return hashcode;
    }

    public boolean equals(Object obj) {
        if(this.hashCode() == obj.hashCode())
            return true;
        else
            return false;

    }
}
