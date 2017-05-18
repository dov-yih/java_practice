package T5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by yidafu on 2017/5/18.
 */
public class TestMain {
    public static void main(String args[]) {
        StudentT5 std1 = new StudentT5(001,"Tom");
        StudentT5 std2 = new StudentT5(002,"Jack");
        std1.addScore("java",89);
        std1.addScore("c++",70);
        std1.addScore("SQL",92);
        std2.addScore("java",78);
        std2.addScore("c++",60);
        std1.modifyScore("SQL",95);

        ArrayList<StudentT5> stds = new ArrayList<StudentT5>();
        stds.add(std1);
        stds.add(std2);

        Iterator it = stds.iterator();
        while(it.hasNext()) {
            StudentT5 std = (StudentT5)it.next();
            System.out.println("---------------------");
            System.out.print("学号：" + std.getId());
            System.out.println("姓名：" + std.getName());
            System.out.println("选了一下课程：");
            HashMap allCourse = std.getAll();
            Iterator iterator2 = allCourse.entrySet().iterator();
            while(iterator2.hasNext()) {
                Map.Entry entry = (Map.Entry) iterator2.next();
                System.out.println("\t课程："+ entry.getKey()+ ",分数：" + entry.getValue());
            }
            System.out.printf("他的平均分：%.4f\n" ,std.getAvgScore());
            System.out.println("---------------------");
        }
    }
}

