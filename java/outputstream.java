import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class outputstream {
    /*
    流对象，操作文件依赖操作系统，用完要释放资源，被占用。
    fileoutputstream
    写入数据文件

    在文件中写入换行，/r/n

    io流的异常处理
    try catch finally
     */
    public static void main(String[] args) throws IOException {
        File w=new File("d:\\test.txt");
        FileOutputStream ops =new FileOutputStream(w,true);
        ops.write("\r\n这是我的最喜欢的编程方式".getBytes());
        ops.close();

    }
}
