import java.io.File;
import java.io.IOException;

public class iotest {
    public static void main(String[] args) throws IOException {
        //内存写到持久化数据output
        //持久化数据读到内存input
        /*
        文件 file
        目录 directory
        路径 path
        file 将文件，目录，路径，封装成file
         */
       String s= File.pathSeparator;//根据操作系统变化
        System.out.println(s);//s=; 路径分隔符

        String w=File.separator;
        System.out.println(w);//目录分隔符  \
        /*
        File(String pathname)
         */
        File path =new File("d:\\test.txt");
        System.out.println(path.exists());

        /*
        file创建和删除
        mkdirs创建文件夹
        delete删除文件或者文件夹
        getname 获取文件夹 或者文件的名字
        getpath获取全路径
        length获取文件字节数  文件夹没有字节的概念
        isDirectory  是不是文件夹
        exists是否存在
        list获取文件列表
        listFiles 目录或者文件的全路径

         */
        File wenjian = new File("d:\\");
        File[] list = wenjian.listFiles();
        for(File ss:list) {
            System.out.println(ss);
        }
    }
}
