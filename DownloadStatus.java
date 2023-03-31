package ConcurrencyAndMultiThreading;

import java.util.concurrent.atomic.LongAdder;

public class DownloadStatus {
    private LongAdder totalByte = new LongAdder();
    public int getTotalByteDownload() {
        return totalByte.intValue();
    }
    public void incrementTotalByte(){
        totalByte.increment();
    }
}
