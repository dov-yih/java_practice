package Person;

//import java.util.Comparable;
/**
 * Created by yidafu on 2017/5/18.
 */
public class Person implements Comparable{
    private String name;
    private int age;

    public Person(String name,int age) {
        this.name   = name;
        this.age    = age;
    }
    public int compareTo(Object obj) {
        if(!(obj instanceof Person))
            throw new RuntimeException("不认识人的对象");
        Person ps = (Person)obj;
         int  flag = this.age < ps.age ? -1 : 1;

        return flag;
    }

    public String getInfo() {
        return this.name + "-|-" + this.age;
    }
}
