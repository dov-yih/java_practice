package Triangle;

import java.util.Scanner;

/**
 * Created by yidafu on 2017/5/19.
 */

/*******************************
 *
 *      sanjiao 被我换成 Triangle
 *
 ******************************/

public class TestMain {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();

        try{
            Triangle.isTriangleStatic(x,y,z);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        x = scan.nextInt();
        y = scan.nextInt();
        z = scan.nextInt();
        Triangle triangle = new Triangle(x,y,z);
        try{
            System.out.println("面积：" + triangle.getArea());
        }catch(NotTriangleException e) {
            System.out.println(e.warnMsg());
        }
        try{
            triangle.showInfo();
        }catch(NotTriangleException e) {
            System.out.println(e.warnMsg());
        }
    }
}
