package ConcurrencyAndMultiThreading;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show(){
        DownloadStatus status = new DownloadStatus();
        Thread thread1 = new Thread(new DownloadFileTask(status));
        Thread thread2 = new Thread(()->{
            while (!status.isDone()){
            }
            System.out.println(status.getTotalByteDownload());
        });
        thread1.start();
        thread2.start();
    }

}
