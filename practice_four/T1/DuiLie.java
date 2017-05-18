package T1;

import java.util.LinkedList;

/**
 * Created by yidafu on 2017/5/18.
 */
public class DuiLie extends LinkedList<String> {
    private static int num;

    public DuiLie() {
        num = 0;
    }

    public void myAdd( String str) {
        super.add(str);
    }
    public String myGet() {
        return super.get(this.num ++);
    }
    public boolean isNull() {
        return num < this.size()? false : true;
    }
}
