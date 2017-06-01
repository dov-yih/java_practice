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
        BufferedReader fb = null;
        FileReader fr = null;
        PrintWriter pw = null;
        String line = null;
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
             fr = new FileReader("info.txt");
             fb = new BufferedReader(fr);
             pw = new PrintWriter(System.out);
             String get = "";
             while(true) {
                 get = fb.readLine();
                 if(get == null)
                     break;
                 pw.println(get);
                 pw.flush();
             }
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            try{
                if(bw != null)
                    bw.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
            try{
                if(fb != null)
                    fb.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
            pw.close();

        }

    }
}