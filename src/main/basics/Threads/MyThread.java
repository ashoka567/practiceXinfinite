package basics.Threads;

public class MyThread extends Thread {

    public static void main(String[] args) {
        MyThread myThread  = new MyThread();
        myThread.start();
        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println(this.getName() +"  "+this.currentThread().getName());
    }
}
