package basics.Threads;

import java.util.concurrent.Semaphore;

public class ThreadPriority extends Thread{

    //String name = null;

    public ThreadPriority(Semaphore semaphore){
        this.semaphore= semaphore;
    }

     Semaphore semaphore;

    @Override
    public void run(){

        try {
            semaphore.acquire();

            synchronized (this){

                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000L);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }

    }

    public static void main(String[] args) {
        Semaphore semaphore =  new Semaphore(1);



        ThreadPriority threadPriority = new ThreadPriority(semaphore);
        threadPriority.setName("A");
        //threadPriority.setPriority(1);
        threadPriority.start();

        ThreadPriority threadPriority1 = new ThreadPriority(semaphore);
        threadPriority1.setName("B");
        //threadPriority.setPriority(5);
        threadPriority1.start();

        ThreadPriority threadPriority3 = new ThreadPriority(semaphore);
        threadPriority3.setName("c");
        //threadPriority.setPriority(7);
        threadPriority3.start();
    }

}
