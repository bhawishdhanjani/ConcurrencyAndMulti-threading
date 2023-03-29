package ConcurrencyAndMultiThreading;

public class DownloadFileTask implements Runnable {


    @Override
    public void run() {
        System.out.println("Downloading File" + Thread.currentThread().getName());
    }
}
