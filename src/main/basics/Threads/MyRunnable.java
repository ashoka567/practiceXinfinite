package basics.Threads;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("RUN");
    }

    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        r.run();
        System.out.println(Thread.currentThread().getName());
    }

}
