package ConcurrencyAndMultiThreading;

public class DownloadFileTask implements Runnable {
    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading File" + Thread.currentThread().getName());
        for (int i = 0 ; i<100_0000 ; i++) {
            if(Thread.currentThread().isInterrupted()) return;
            status.incrementTotalByte();
        }
        System.out.println("Download Done");
        status.done();
        synchronized (status){
            status.notifyAll();
        }
    }
}
