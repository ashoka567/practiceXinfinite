package basics.Threads;

public class DeadLockTest {

    public static void main(String[] args){
        try {
            Test test1 = new Test(Thread.currentThread());

            Thread t1 = new Thread(test1);
            t1.join();


            Test test2 = new Test(null);

            Thread t2 = new Thread(test2);


            t2.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Test implements Runnable {

    Thread t;

    public Test(Thread t){
        this.t = t;
    }

    @Override
    public void run() {
        try {
            if (t != null) {
                t.join();
            }
            for (int i = 0; i < 100; i++) {
                System.out.println("Test" + i + Thread.currentThread().getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
