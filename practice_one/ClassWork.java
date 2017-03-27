package Class;

import java.util.Scanner;

public class ClassWork{
    public static void main(String args[]){
    	System.out.println("**************************\n第一题：");
    	T1 t1 = new T1();
    	System.out.println(t1.getSum());
    	
    	System.out.println("**************************\n第二题：");
    	T2 t2 = new T2();
    	System.out.println(t2.out());
    	
    	
    	System.out.println("**************************\n第三题：");
//    	Scanner scan = new Scanner(System.in);
//    	int in = scan.nextInt();
    	// 为了便于调试注解从控制台获取字符串
    	int in = 1595;
    	T3 t3 = new T3(in);
    	t3.print();
    	
    	System.out.println("**************************\n第四题：");
    	T4 t4 = new T4();
    	t4.print();
    	System.out.println("");
    	System.out.println("**************************\n第五题：");
    	T5 t5 = new T5();
    	t5.print();
    	
    	System.out.println("**************************\n第六题：");
    	T6 t6 = new T6();
    	t6.print();
    	
    	System.out.println("**************************\n第七题：");
    	T7 t7 = new T7();
    	t7.printNum();
    	
    	System.out.println("**************************\n第八题：");
    	T8 t8 = new T8();
    	t8.print();
    	
    	System.out.println("**************************\n第九题：");
    	T9 t9 = new T9();
    	System.out.println(t9.compare());
    	
    	System.out.println("**************************\n第十题：");
//    	Scanner get = new Scanner(System.in);
//    	String str = get.nextLine();
    	String str = "1234555666789";
    	T10 t10 = new T10(str);
    	System.out.println("重复次数最多的最大数是：" + t10.judge());
    	
  }
}
