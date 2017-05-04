import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by java on 04/05/17.
 */
public class MainTest2 {
    public static void main(String args[]) {
        ArrayList<Student2> list = new ArrayList<Student2>();
        list.add(new Student2(1,"Tom",20));
        list.add(new Student2(2,"Jack",21));
        list.add(new Student2(3,"John",22));
        list.add(new Student2(4,"Tom",20));
        list.add(new Student2(5,"John",22));
        Student2 item1,item2;
        for(int i = 0; i < list.size(); i ++){
            item1 = (Student2) list.get(i);
            for(int j = i + 1; j < list.size(); j ++) {
                item2 = (Student2) list.get(j);
                if(item2.equals(item1)){
                    list.remove(item2);
                }
            }
        }
        Iterator it = list.iterator();
        while(it.hasNext()) {
              Student2 st1 = (Student2) it.next();
              st1.getInfo();
        }
    }
}
