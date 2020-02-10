package basics.Threads;

import java.time.Year;

public class InterruptingThread extends Thread {

    @Override
    public void run(){
        try {
            Thread.sleep(20000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {

            //Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {

        InterruptingThread  interruptingThread = new InterruptingThread();
        interruptingThread.start();
        interruptingThread.interrupt(); // can interrupt only when thread is sleeping. if thread is not sleeping nothing to interrupt.
        if(interruptingThread.isInterrupted()){
            System.out.println("its interrupted.");
        }
    }
}
