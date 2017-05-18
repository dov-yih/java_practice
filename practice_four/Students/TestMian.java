package Students;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by yidafu on 2017/5/18.
 */
public class TestMian {
    public static void main(String args[]) {
        HashSet<Student> sdHS = new HashSet<Student>();
        sdHS.add(new Student("张三","class1","Java",85));
        sdHS.add(new Student("周乐儿","class1","C#",79));
        sdHS.add(new Student("王涛","class2","C#",52));
        sdHS.add(new Student("李明","class2","Java",48));
        sdHS.add(new Student("李明","class2","Java",48));

        Iterator<Student> it = sdHS.iterator();
        while(it.hasNext()){
            Student tmp = (Student)it.next();
            System.out.println(tmp.getInfo());
        }
    }
}
