package Students;

import java.util.Comparator;

/**
 * Created by yidafu on 2017/5/18.
 */
public class MyComparator implements Comparator<Student> {
    public int  compare(Student std1,Student std2){
        return std1.hashCode() == hashCode() ? 0 : 1;
    }
}
