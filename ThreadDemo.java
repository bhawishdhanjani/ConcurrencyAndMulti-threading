package ConcurrencyAndMultiThreading;

public class ThreadDemo {
    public static void show(){
        System.out.println(Thread.currentThread().getName());
        for (int i = 0 ; i<10 ; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }

    }

}
