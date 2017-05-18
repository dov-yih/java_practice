package T2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by yidafu on 2017/5/18.
 */
public class TestMain {
    public static void main(String args[]) {
        TreeSet<String> mts = new TreeSet<String>(new MyComparator());
        mts.add("abc");
        mts.add("de");
        mts.add("gong");
        mts.add("De");
        mts.add("abc");
        mts.add("Foo");
        mts.add("gong");

        Iterator<String> it = mts.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    //  {"abc","de","gong","De","abc","Foo","gong"}
}
