public class cc implements Runnable {


private  int titce=100;
private Object obj= new Object();
    @Override
    @Deprecated
    public void run() {

        while (true){
            synchronized (obj) {
                if (titce > 0) {
                    System.out.println(Thread.currentThread().getName() + "出售第" + titce + "张票");
                    titce--;
                }
            }
        }
    }
}
