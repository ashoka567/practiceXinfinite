package basics.Threads;

public class MyThread extends Thread {

    public static void main(String[] args) {
        MyThreadJoin myThreadJoin = new MyThreadJoin();
        myThreadJoin.start();
        MyThreadJoin myThreadJoin2 = new MyThreadJoin();
        myThreadJoin2.start();
        MyThreadJoin myThreadJoin3 = new MyThreadJoin();
        myThreadJoin3.start();


        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.getName() +"  "+this.currentThread().getName());
    }
}
