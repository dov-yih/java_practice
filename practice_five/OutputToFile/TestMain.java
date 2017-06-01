package OutputToFile;

import java.io.*;
import java.io.IOException;

/**
 * Created by yidafu on 2017/6/1.
 */
public class TestMain {
    public static void main(String[] args) {
        File newfile = new File("my.txt");
        FileOutputStream Out = null;
        try{
            if(!newfile.exists())
                newfile.createNewFile();
            Out = new FileOutputStream(newfile) ;
            byte[] info = "姓名：易大富 性别：男 年龄：20 班级：五班".getBytes();
            Out.write(info);
        }catch(IOException e) {
            e.printStackTrace();
        }finally{
            if(Out != null)
                try{
                    Out.close();
                }catch(IOException e) {
                    e.printStackTrace();
                }
        }

    }
}
