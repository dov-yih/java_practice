package BufferedCopy;

import java.io.*;

/**
 * Created by yidafu on 2017/6/1.
 */
public class TestMain {
    private static int lineNum = 1;
    public static void main(String[] args) {
        FileReader srcFile = null;
        FileWriter tagFile = null;
        try{
            srcFile = new FileReader("you.txt");
            tagFile = new FileWriter("copy.txt");

            BufferedReader buffR = new BufferedReader(srcFile);
            BufferedWriter buffW = new BufferedWriter(tagFile);

            String line = null;
            String newline = null;
            while(true) {
                line    = buffR.readLine();
                if(line == null)
                    break;
                newline = "第" + lineNum + "行:" + line;
                buffW.write(newline);
                buffW.newLine();
                buffW.flush();
                lineNum ++;
            }
        }catch(IOException e) {
            e.printStackTrace();
        }finally{
            try{
                if(srcFile != null) {
                    srcFile.close();
                }
            }catch(IOException e) {
                e.printStackTrace();
            }
            try{
                if(tagFile != null) {
                    tagFile.close();
                }
            }catch(IOException e) {
                e.printStackTrace();
            }
        }



    }
}
