package ConcurrencyAndMultiThreading;

public class DownloadStatus {
    private int totalByte;

    public int getTotalByteDownload() {
        return totalByte;
    }
    public void incrementTotalByte(){
        totalByte++;
    }
}
