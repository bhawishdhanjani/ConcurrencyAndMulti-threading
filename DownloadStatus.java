package ConcurrencyAndMultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalByte;
    private Lock lock = new ReentrantLock();

    public int getTotalByteDownload() {
        return totalByte;
    }
    public void incrementTotalByte(){
        lock.lock();
        try {
            totalByte++;
        }
        finally {
            lock.unlock();
        }
    }
}
