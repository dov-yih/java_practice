package PersonInfo;

import java.io.*;
import java.util.Scanner;

/**
 * Created by yidafu on 2017/6/1.
 */
public class TestMain {
    public static void main(String[] args) {
        FileWriter fw  = null;
        BufferedWriter bw = null;
//        char[] line = new char[10];
        int length = 0;
        String line = null;
        InputStreamReader input =  new InputStreamReader(System.in);
        try{
             fw = new FileWriter("info.txt");
             bw  = new BufferedWriter(fw);
             Scanner scan = new Scanner(System.in);

             while(true) {
                 line  =  scan.nextLine();
                 if("done".equals(line)){
                     break;
                 }
                 bw.write(line);
                 bw.newLine();
                 bw.flush();
             }
             FileReader fr = new FileReader("info.txt");
            BufferedReader fb = new BufferedReader(fr);
             PrintWriter pw = new PrintWriter(System.out);
             String get = "";
             while((get = fb.readLine()) != null) {
                 pw.print(get);
             }
             fb.close();
             pw.close();
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            try{
                if(bw != null)
                    bw.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
//                  hdupublic.163.com