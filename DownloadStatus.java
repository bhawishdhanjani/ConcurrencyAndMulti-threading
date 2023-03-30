package ConcurrencyAndMultiThreading;
public class DownloadStatus {
    private int totalByte;

    private volatile boolean isDone;

    private Object totalByteLock = new Object();
    public int getTotalByteDownload() {
        return totalByte;
    }

    public void incrementTotalByte(){
        synchronized (totalByteLock){
            totalByte++;
        }
    }
    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
