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

        HashMap<String,HashMap> result = new HashMap<String,HashMap>();

        Iterator iterator = aList.iterator();
        while(iterator.hasNext()) {
            Student std = (Student)iterator.next();
            String className = std.getClassName();
            if(!result.containsKey(className))
                result.put(className,new HashMap<String , Double>());

            HashMap tmpsubject  = result.get(className);

            HashMap allCourse   = std.getAll();
            Iterator iterator2  = allCourse.entrySet().iterator();

            Iterator iterator3  = tmpsubject.entrySet().iterator();

            // 遍历学生的成绩的HashMap
            while (iterator2.hasNext()) {
                Map.Entry entryOut = (Map.Entry) iterator2.next();
                if (!tmpsubject.containsKey((String) entryOut.getKey()))
                    tmpsubject.put(entryOut.getKey(),entryOut.getValue());
                int tmp = (int)entryOut.getValue();
                double tmpScore = (double)entryOut.getValue() + (double)tmp;
                tmpsubject.put((String)entryOut.getKey(),(Double)tmpScore);

//                while (iterator2.hasNext()) {
//                    Map.Entry entryInner=(Map.Entry) iterator2.next();
//                    if (!tmpsubject.containsKey((String) entryInner.getKey()))
//                        tmpsubject.put(entryInner.getKey(), entryInner.getValue());
//                    double tmpScore = (double)entryOut.getValue() + (double)entryInner.getValue();
//                    tmpsubject.put((String)entryOut.getKey(),(Double)tmpScore);
//                }
            }

//            Iterator iterator3 = allset.iterator();
//            while(iterator3.hasNext()){
//                if(!tmpsubject.containsKey((String)iterator3.next()));
//            }


//            while(iterator3.hasNext()) {
//                Map.Entry entry = (Map.Entry) iterator3.next();
//
//            }
//            result.put(className,tmpScore);
        }

        Iterator iterator4 = result.entrySet().iterator();
        while (iterator4.hasNext()) {
            Map.Entry entry=(Map.Entry) iterator4.next();
            System.out.println("班级：" + entry.getKey());
            HashMap tmpsubjects=(HashMap) entry.getValue();
            Iterator iterator5=tmpsubjects.entrySet().iterator();
            while (iterator5.hasNext()) {
                Map.Entry entry5 = (Map.Entry)iterator5.next();
                System.out.println("subject:" + entry5.getKey() + ",score:" + (Double)entry5.getValue());
            }
        }
    }
}
