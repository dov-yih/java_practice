import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by yidafu on 2017/6/1.
 */
public class Copy {
    public static void main(String[] args) throws IOException{
        File newfile = new File("D:\\Java\\Five\\src\\InputFromFile\\TestMain.java");
        if(!newfile.exists())
            throw new IOException();
        FileOutputStream out = null;


        FileInputStream input = null;

        try{
            out = new FileOutputStream( newfile.getParent()+ "\\Copy.java");
            input = new FileInputStream(newfile);
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
