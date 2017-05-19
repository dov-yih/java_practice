package Email;

import java.util.Scanner;

/**
 * Created by yidafu on 2017/5/19.
 */
public class TestMain {
    public static void main(String args[]) {
        Scanner emailIn = new Scanner(System.in);
        System.out.println("请输入第一个测试字符串：");
        String str = emailIn.nextLine();
        Email em1 = new Email(str);
        try{
            em1.checkEmail();
        }catch(EmailException e) {
            System.out.println(e.warnMsg());
        }

        System.out.println("请输入第一个测试字符串：");
        str = emailIn.nextLine();
        Email em2 = new Email(str);
        try{
            em2.checkEmail();
        }catch(EmailException e) {
            System.out.println(e.warnMsg());
        }
    }
}
