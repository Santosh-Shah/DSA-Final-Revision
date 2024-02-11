package oops.multithreading;

public class Main {
    public static void main(String[] args) {
//        MyThread thread = new MyThread();
//        thread.start(); // Start the thread
//        thread.toString();

        MyRunnable myRunnable = new MyRunnable();
//        Thread thread = new Thread(myRunnable);
//        thread.start();
        myRunnable.run();

    }
}
