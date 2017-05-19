package Email;

/**
 * Created by yidafu on 2017/5/19.
 */
public class EmailException extends Exception {
    String msg;
    public EmailException() {
        this.msg = "你输入的邮箱没有-> @ <-";
    }
    public EmailException(String str) {
        this.msg = "你输入的邮箱@前的字符少于6";
    }
    public String warnMsg() {
        return "|--Exception:" + this.msg;
    }
}
