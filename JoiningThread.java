package ConcurrencyAndMultiThreading;

public class JoiningThread {
    public static void show(){
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("File is downloaded");


    }
}
