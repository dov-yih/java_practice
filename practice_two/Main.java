/**
 * Created by yidafu on 17-4-6.
 */
public class Main {
    public static void main(String arges[]) {
        int i = 0;
        double sum = 0.0;
        double max;
        double min;
        Student[] stu = new Student[5];
        stu[0] = new Student("0001", "hahaha", "man", 20, 80.5);
        stu[1] = new Student("0002", "hehehe", "man", 22, 85);
        stu[2] = new Student("0003", "heiheihei", "man", 23, 87);
        stu[3] = new Student("0004", "hohoho", "man", 24, 91);
        stu[4] = new Student("0005", "hihihi", "man", 26, 79);
        //笔记
        max = stu[0].getSJavaGrade();
        min = stu[0].getSJavaGrade();
        for (; i < 5; i++) {
            sum += stu[i].getSJavaGrade();
            if (max >= stu[i].getSJavaGrade())
                max = stu[i].getSJavaGrade();
            if (min <= stu[i].getSJavaGrade())
                min = stu[i].getSJavaGrade();
        }
        System.out.println("平均数：" + sum / 5);
        System.out.println("最大数：" + max);
        System.out.println("最小数：" + min);

        System.out.println("***************************************");

        Car car1 = new Car();
        car1.setPlateNum("辽 A9752");
        car1.speedUp(20);
        System.out.println(car1.getInfo());

        Car car2 = new Car("辽B5086", 150, 200);
        car2.speedDown(20);
        System.out.println(car2.getInfo());

        System.out.println("***************************************");

        Account a = new Account(1122, 20000, 4.5);
        a.withDraw(2500);
        a.deposit(3000);
        System.out.println(a.getInfo());
    }
}
