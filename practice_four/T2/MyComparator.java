package T2;

import java.util.Comparator;

/**
 * Created by yidafu on 2017/5/18.
 */
public class MyComparator implements Comparator<String> {
    public int compare(String str1,String str2){
        return str1.compareToIgnoreCase(str2);
    }
}
