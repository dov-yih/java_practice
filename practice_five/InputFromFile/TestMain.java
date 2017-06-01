package InputFromFile;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by yidafu on 2017/6/1.
 */
public class TestMain {
    public static void main(String[] args) throws IOException{
        File newfile = new File("D:\\Java\\Five\\src\\InputFromFile\\TestMain.java");
        if(!newfile.exists())
            throw new IOException();
        FileReader fileReader = new FileReader(newfile);

        char[] line = new char[1024];
        int length;
        while(true) {
            length = fileReader.read(line);
            if(length == -1){
                break;
            }
            System.out.print(line);
        }

        fileReader.close();
    }
}
