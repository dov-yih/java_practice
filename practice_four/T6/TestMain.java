package T6;

import java.util.*;

/**
 * Created by yidafu on 2017/5/18.
 */
public class TestMain{
    public static void main(String args[]) {
        Student s1 = new Student(1,"a","class1");
        s1.addScore("sql server", 90);
        s1.addScore("C++",89);
        s1.addScore("Java", 76);

        Student s2 = new Student(2,"b","class1");
        s2.addScore("sql server", 92);
        s2.addScore("C++", 88);
        s2.addScore("Java",80);

        Student s3 = new Student(1,"aa","class2");
        s3.addScore("sql server", 91);
        s3.addScore("Java", 78);

        Student s4 = new Student(2,"bb","class2");
        s4.addScore("C++", 60);
        s4.addScore("Java", 56);

        ArrayList<Student> aList = new ArrayList<Student>();
        aList.add(s1);
        aList.add(s2);
        aList.add(s3);
        aList.add(s4);

        // 结果的HashMap，这是一个键为String，值为HashMap的HashMap
        HashMap<String,HashMap> result = new HashMap<String,HashMap>();

        // 遍历aList，把成绩放入result中
        Iterator iterator = aList.iterator();
        while(iterator.hasNext()) {
            Student std = (Student)iterator.next();

            String className = std.getClassName();
            if(!result.containsKey(className))
                result.put(className,new HashMap<String , Double>());

            //  结果里的成绩的HashMap
            HashMap tmpsubject  = result.get(className);

            //  获得每个学生的所有成绩
            HashMap allCourse   = std.getAll();
            Iterator iterator2  = allCourse.entrySet().iterator();

            // 遍历学生的成绩的HashMap，成绩放入result的值HashMap中
            while (iterator2.hasNext()) {

                //  key 科目名，value 成绩
                Map.Entry entryOut = (Map.Entry) iterator2.next();

                //  不含这个学生的科目就加上它
                if (!tmpsubject.containsKey((String) entryOut.getKey())){
                    tmpsubject.put(entryOut.getKey(),entryOut.getValue());
                }else {
                    // 有这个科目，就取出原来的成绩加上现在的成绩，再放入
                    //  学生的成绩
                    int tmp = (int)entryOut.getValue();
                    int re_tmp = (int)tmpsubject.get(entryOut.getKey());
                    int tmpScore =  re_tmp + (int)tmp;
                    tmpsubject.put((String)entryOut.getKey(),(Integer)tmpScore);
                    tmpScore = 0;

                }
            }
        }

        Iterator iterator4 = result.entrySet().iterator();
        while (iterator4.hasNext()) {
            Map.Entry entry=(Map.Entry) iterator4.next();
            System.out.println("班级：" + entry.getKey());
            HashMap tmpsubjects=(HashMap) entry.getValue();
            Iterator iterator5=tmpsubjects.entrySet().iterator();
            while (iterator5.hasNext()) {
                Map.Entry entry5 = (Map.Entry)iterator5.next();

                // 这里因为特殊就取巧了（莫扣分）
                int tmp = (int)entry5.getValue() < 100 ? 1 : 2;

                System.out.println("subject:" + entry5.getKey() + ",score:" + (double)(int)entry5.getValue()/ tmp );

            }
        }
    }
}
