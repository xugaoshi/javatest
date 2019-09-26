import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class demo {
    static String s;
    public static void main(String[] args) throws IOException {
         /*
          用io流实现文件复制
          */
       //1读取原文件
        FileInputStream in = new FileInputStream("d:\\test.txt");
        byte[] b= new byte[1024];
        int len=0;
        String ss=null;
        while((len=in.read(b))!=-1){
            ss=new String(b,0,len);
        }
        in.close();
        //2.复制到新文件
        FileOutputStream out = new FileOutputStream("d:\\copy.txt");
        out.write(ss.getBytes());
        out.close();
    }
}
