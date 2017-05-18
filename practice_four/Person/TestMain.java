package Person;

import java.util.TreeSet;
import java.util.Iterator;
/**
 * Created by yidafu on 2017/5/18.
 */
public class TestMain {
    public static void main(String agrs[]) {
        TreeSet<Person> ps = new TreeSet<Person>();
        ps.add(new Person("小红",3));
        ps.add(new Person("tom",4));
        ps.add(new Person("tony",2));
        ps.add(new Person("jeny",8));

        Iterator it = ps.iterator();

        while(it.hasNext()) {
            Person temPs = (Person)it.next();
            System.out.println(temPs.getInfo());
        }
    }
}
