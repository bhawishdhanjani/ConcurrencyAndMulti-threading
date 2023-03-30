package ConcurrencyAndMultiThreading;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show(){
        DownloadStatus status = new DownloadStatus();
        Thread thread1 = new Thread(new DownloadFileTask(status));
        Thread thread2 = new Thread(()->{
            while (!status.isDone()){
                synchronized (status){
                    try {
                        status.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(status.getTotalByteDownload());
        });
        thread1.start();
        thread2.start();
    }

}
