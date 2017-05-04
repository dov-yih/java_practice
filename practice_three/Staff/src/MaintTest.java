import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
//import java.util.ConcurrentModificationException;
/**
 * Created by java on 04/05/17.
 */
public class MaintTest {
    public static void main(String args[]) {
        Collection<Staff> colle = new ArrayList<Staff>();
        colle.add(new Staff(1001,"Tom","Market",1200));
        colle.add(new Staff(1002,"Jack","Department",1300));
        colle.add(new Staff(1003,"Simth","Market",2000));
        colle.add(new Staff(1004,"Tony","Department",3000));

        Staff sta;
        int totalMarket = 0,totalDepartment = 0;
        Iterator it = colle.iterator();
        while(it.hasNext()){
            sta = (Staff) it.next();
            System.out.println("name:" + sta.getName() + "\tselary:" + sta.getSelary());
            if(sta.getName() == "Jack")
                sta.changeSelary(1);
            sta.changeSelary((float) 1.0);
            if(sta.getDepartment() == "Market")
                totalMarket += sta.getSelary();
            else
                totalDepartment += sta.getSelary();

            // 删除 Tony
            if (sta.getName() == "Tony")
                it.remove();
        }

        System.out.println("Market:" + (float)totalMarket/2 + "Department:" + (float)totalDepartment/2);
    }
}
