package ConcurrencyAndMultiThreading;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ThreadDemo {
    public static void show(){
        Collection<Integer> list = Collections.synchronizedCollection(new ArrayList<>());
        Thread thread1 = new Thread(()->list.addAll(List.of(1,2,3,4,5,6,7,8,9,10)));
        Thread thread2 = new Thread(()-> list.addAll(List.of(10,11,12,13,14,15,16,17,18,19,20)));
        thread1.start();
        thread2.start();
        try {
            thread2.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list);


    }

}
