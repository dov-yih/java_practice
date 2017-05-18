package T2;

import java.util.TreeSet;

/**
 * Created by yidafu on 2017/5/18.
 */
public class MyTreeSet  extends TreeSet {
    public boolean comparator(String str1,String str2) {
        System.out.println("done");
        return str1.compareToIgnoreCase(str2) > 0 ? true : false;
    }
}
