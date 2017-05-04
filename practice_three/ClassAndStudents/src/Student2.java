/**
 * Created by java on 04/05/17.
 */
public class Student2 {
    private int schoolNumber;
    private String name;
    private int age;

    public Student2() {}

    public Student2( int schoolNumber,String name,int age) {
        this.schoolNumber   = schoolNumber;
        this.name           =name;
        this.age            = age;
    }

    public int getSchoolNumber() {
        return schoolNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.println("sid:" + this.schoolNumber + ",name:" + this.name + ",this:" + this.age);
    }

    public boolean equals(Student2 st) {
        return this.name == st.getName() && this.age == st.getAge() ? true: false;
    }
}
