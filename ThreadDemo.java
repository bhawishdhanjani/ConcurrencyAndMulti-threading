package ConcurrencyAndMultiThreading;

public class ThreadDemo {
    public static void show(){
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(()-> System.out.println("Downloading file "+ Thread.currentThread().getName()));
        thread.start();
    }

}
