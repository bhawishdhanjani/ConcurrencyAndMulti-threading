package ConcurrencyAndMultiThreading;

import java.util.ArrayList;
import java.util.List;

public class ThreadDemo {
    public static void show(){
        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();
        for(int i =0 ;i<10 ;i++) {
            var task= new DownloadFileTask();
            Thread thread = new Thread(task);
            threads.add(thread);
            tasks.add(task);
            thread.start();

        }
        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        var totalByte = tasks.stream().map(m -> m.getStatus().getTotalByteDownload())
                        .reduce(Integer::sum);
        System.out.println(totalByte);

    }

}
