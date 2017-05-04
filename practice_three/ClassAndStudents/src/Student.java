/**
 * Created by java on 04/05/17.
 */
public class Student {
    private String name;
    private String klass;
    private String subject;
    private int grade;

    public Student(){

    }

    public Student(String name,String klass,String subject,int grade) {
        this.name = name;
        this.klass = klass;
        this.subject = subject;
        this.grade= grade;
    }

    public String getSubject() {
        return this.subject;
    }
    public int getGrade() {
        return this.grade;
    }
}
