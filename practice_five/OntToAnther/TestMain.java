package OntToAnther;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by yidafu on 2017/6/1.
 */
public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入源文件：");
        String srcFileName = scanner.nextLine();
        System.out.println("请输入目标文件：");
        String tagFileName = scanner.nextLine();

        File src = new File(srcFileName);
        File tag = new File(tagFileName);
        copyFile(src,tag);
    }
    public static void copyFile(File srcFile,File tagFile) {
        FileOutputStream out = null;


        FileInputStream input = null;

        try{
            out = new FileOutputStream(tagFile);
            input = new FileInputStream(srcFile);
            byte[] line = new byte[1024];
            int length = 0;
            while(true) {
                length = input.read(line);
                if(length == -1)
                    break;
                out.write(line , 0 , length);
            }
        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if(out != null)
                    out.close();
            }catch (IOException e){
                e.printStackTrace();
            }
            try{
                if(input != null)
                    out.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
