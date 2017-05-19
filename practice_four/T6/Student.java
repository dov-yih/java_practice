package T6;

/**
 * Created by yidafu on 2017/5/18.
 */
public class Student extends T5.StudentT5 {
   private String className;

   public Student(int id,String name,String className) {
       super(id,name);
       this.className = className;
   }

   public String getClassName() {
       return this.className;
   }
}
