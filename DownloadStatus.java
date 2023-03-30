package ConcurrencyAndMultiThreading;

import java.util.concurrent.atomic.AtomicInteger;

public class DownloadStatus {
    private AtomicInteger totalByte = new AtomicInteger();
    public int getTotalByteDownload() {
        return totalByte.get();
    }
    public void incrementTotalByte(){
        totalByte.incrementAndGet();
    }
}
