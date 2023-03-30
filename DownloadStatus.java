package ConcurrencyAndMultiThreading;
public class DownloadStatus {
    private int totalByte;
    private Object totalByteLock = new Object();

    public int getTotalByteDownload() {
        return totalByte;
    }
    public void incrementTotalByte(){
        synchronized (totalByteLock){
            totalByte++;
        }
    }
}
