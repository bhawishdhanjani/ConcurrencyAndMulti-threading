package ConcurrencyAndMultiThreading;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadDemo {
    public static void show(){
        Map<Integer,String> map = new ConcurrentHashMap<>();
        Thread thread1 = new Thread(()->{
            map.put(1,"A");
        });
        Thread thread2 = new Thread(()->{
            map.put(2,"B");
        });

        thread1.start();
        thread2.start();
        try {
            thread2.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(map);


    }

}
