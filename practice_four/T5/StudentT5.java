package T5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by yidafu on 2017/5/18.
 */
public class StudentT5 {
    private int sid;
    private String sname;
    private HashMap scoreMap;

    public StudentT5() {
        scoreMap  = new HashMap();
    }

    public StudentT5(int sid,String sname) {
        this.sid    = sid;
        this.sname  = sname;
        scoreMap    = new HashMap();
    }

    public String getName(){
        return this.sname;
    }

    public int getId(){
        return this.sid;
    }

    public void addScore(String courseName,int score) {
        scoreMap.put(courseName,score);
    }

    public void modifyScore(String courseName,int score) {
        if(!scoreMap.containsKey(courseName))
            throw new RuntimeException("不存在键为" + courseName + "的值");
            scoreMap.put(courseName,score);
    }

    public int getScore(String courseName) {
        return (int)this.scoreMap.get(courseName);
    }

    public HashMap getAll() {
        return this.scoreMap;
    }

    public double getAvgScore() {
         Collection<Integer> scores = scoreMap.values();
         double avarage = 0.0;
         Iterator it = scores.iterator();
         while(it.hasNext()) {
             avarage += (double)(int)it.next();
         }
         return avarage/(scores.size());
    }
}
