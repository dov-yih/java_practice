package Triangle;

/**
 * Created by yidafu on 2017/5/19.
 */

/*******************************
 *
 *      sanjiao 被我换成 Triangle
 *
 ******************************/

public class NotTriangleException extends Exception{
    private String msg;

    public NotTriangleException() {
        this.msg = "unknow Exception";
    }

    public NotTriangleException(int x,int y,int z) {
        this.msg =  "x:" + x + " y:" + y + " z:" + z + "不能构成三 角形";
    }
    public String warnMsg() {
        return this.msg;
    }
}
