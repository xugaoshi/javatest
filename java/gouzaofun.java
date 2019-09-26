import java.util.Scanner;

public class gouzaofun {

    private int age;
    @Deprecated
    private String name;

    public gouzaofun(int age,String name){
                this.age=age;
                this.name=name;
    }
    @Override
   public String toString(){
       return age+name;
   }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] md=in.nextLine().split(" ");

        //月份数
        int month = Integer.parseInt(md[0]);;
        //日
        int day =Integer.parseInt(md[1]);
        //所需要转化的字符
        String text =in.nextLine();;
        start(month, day, text);
    }

    public static void start(int month, int day, String text) {
        char[] chars = text.toCharArray();
        for (char c : chars) {
            String value = getChar(month, day, c);
            System.out.print(value + ",");
        }
    }

    public static String getChar(int month, int day, char c) {
        month -= 1;
        day -= 1;
        char[][] chars = {
                {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'},
                {'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'},
                {'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' '}};
        int monthFoward = month % chars.length;
        int dayFoward = day % chars[0].length;
        chars = sort(chars, monthFoward);
        for (int i = 0; i < chars.length; i++) {
            char[] arr = chars[i];
            sort(arr, dayFoward);
        }
        return getCharLocation(chars, c);
    }

    public static String getCharLocation(char[][] chars, char c) {
        String value = "";
        sys:
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                char ch = chars[i][j];
                if (ch == c) {
                    value = ++i + "" + ++j;
                    break sys;
                }
            }
        }
        return value;
    }

    public static char[] sort(char[] chars, int dayFoward) {
        char[] arr = chars.clone();
        for (int i = 0; i < chars.length; i++) {
            int forward = i + dayFoward >= chars.length ? i + dayFoward - chars.length : i + dayFoward;
            chars[i] = arr[forward];
        }
        return chars;
    }

    public static char[][] sort(char[][] chars, int monthFoward) {
        char[][] arr = chars.clone();
        for (int i = 0; i < chars.length; i++) {
            int forward = i + monthFoward >= chars.length ? i + monthFoward - chars.length : i + monthFoward;
            chars[i] = arr[forward];
        }
        return chars;
    }

}
