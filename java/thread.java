import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

public class thread {
        Consumer c=(o)->{
            System.out.println(o);
        };
    public static void main(String[] args) {
        String f = "";//第一行
        String s = "";//第二行
        int sum=0;
        Scanner in = new Scanner(System.in);
            f = in.nextLine();
            s = in.nextLine();
        String[] numstr = s.split(" ");
        for(int i=0;i<numstr.length-1;i++){//外层循环控制排序趟数
            for(int j=0;j<numstr.length-1-i;j++){//内层循环控制每一趟排序多少次
                if(Integer.parseInt(numstr[j])>Integer.parseInt(numstr[j+1])){
                    String temp=numstr[j];
                    numstr[j]=numstr[j+1];
                    numstr[j+1]=temp;
                }
            }
        }

            for (int i = 0; i <=numstr.length; i++) {
                    sum = sum + Integer.parseInt(numstr[i]);
                    if(sum>Integer.parseInt(f)){
                        System.out.println(sum-Integer.parseInt(numstr[i]));

                    }else if(sum==Integer.parseInt(f)){
                        System.out.println(sum);
                    }
                }


    }
}
