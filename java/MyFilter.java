import java.io.File;
import java.io.FileFilter;
/*
自定义过滤器，实现FileFilter接口，重写抽象方法
 */
public class MyFilter implements FileFilter {
    @Override
    //1.作为注释，帮助自己检查是否正确的复写了父类中已有的方法
    //2.便于别人理解代码
    //3.编译器可以给你验证@Override下面的方法名是否是你父类中所有的，如果没有则报错．
    public boolean accept(File pathname){
        return pathname.getName().endsWith(".txt");
    }
}
