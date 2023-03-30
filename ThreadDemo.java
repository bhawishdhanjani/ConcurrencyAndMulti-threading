package ConcurrencyAndMultiThreading;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show(){
        List<Thread> threads = new ArrayList<>();
        var status = new DownloadStatus();
        for(int i =0 ;i<10 ;i++) {
            Thread thread = new Thread(new DownloadFileTask(status));
            threads.add(thread);
            thread.start();

        }
        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println(status.getTotalByteDownload());


    }

}
