package basics.Threads;

public class MyThreadJoin extends Thread {

    public static void main(String[] args) {
        MyThreadJoin myThreadJoin = new MyThreadJoin();
        myThreadJoin.setName("1");
        myThreadJoin.start();
        try {
            myThreadJoin.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        MyThreadJoin myThreadJoin2 = new MyThreadJoin();
        myThreadJoin2.setName("2");
        myThreadJoin2.start();

        MyThreadJoin myThreadJoin3 = new MyThreadJoin();
        myThreadJoin3.setName("3");
        myThreadJoin3.start();

        try {
            myThreadJoin.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void run() {
        try {
            Thread.sleep(12);
            System.out.println("A"+Thread.currentThread().getName());

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //System.out.println(this.getName() +"  "+this.currentThread().getName());
    }
}
