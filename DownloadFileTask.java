package ConcurrencyAndMultiThreading;

public class DownloadFileTask implements Runnable {
    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading File" + Thread.currentThread().getName());
        for (int i = 0 ; i<10_000 ; i++) {
            if(Thread.currentThread().isInterrupted()) return;
            status.incrementTotalByte();
        }

    }
}
