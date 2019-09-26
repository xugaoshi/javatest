import java.io.File;

public class digui {
    public static void main(String[] args) {
        File file=new File("d:\\");
        //getall(file);//递归调用遍历文件
        int s=sum(100);
        System.out.println(s);
    }
    /*
    递归调用
     */
    public static  void getall(File file){
        File[] flies=file.listFiles();
        for(File ss:flies){
            if(ss.isDirectory()){
               getall(ss);
            }else {
                System.out.println(ss);
            }
        }
    }
    /*
    递归求和
     */
    public static int sum(int i ){
        if(i==1){
            return 1;
        }

        return i+ sum(i-1);

    }
}
