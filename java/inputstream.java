import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class inputstream {
    /*
    字节输入流，读取任意文件
     */
    public static void main(String[] args) throws IOException {
        FileInputStream in=new FileInputStream("d:\\test.txt");
        int len=0;
        byte[] b=new byte[1024];
        while((len=in.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }
        in.close();

    }

}
