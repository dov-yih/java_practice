import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by java on 04/05/17.
 */
public class MainTest {
    public static void main(String args[]) {
        Student s1 = new Student("张三","class1","Java",85);
        Student s2 = new Student("周乐儿","class1","C#",79);
        Student s3 = new Student("王涛","class2","C#",52);
        Student s4 = new Student("李明","class2","Java",48);

        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        int gradeOfJava = 0;
        int gradeOfC井 = 0;
        Iterator it = list.iterator();
        while(it.hasNext()){
            Student stu = (Student) it.next();
            if(stu.getSubject() == "Java")
                gradeOfJava += stu.getGrade();
            else
                gradeOfC井 += stu.getGrade();
        }
        System.out.println("C#的平均分" + (float)gradeOfC井/2);
        System.out.println("Java的平均分" + (float)gradeOfJava/2);
    }
}
