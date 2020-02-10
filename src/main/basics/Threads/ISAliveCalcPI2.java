package basics.Threads;

// CalcPI2.java
public class ISAliveCalcPI2
{
    public static void main (String [] args)
    {
        MyPIThread  mt = new MyPIThread();
        mt.start ();
        while (mt.isAlive ())
            try
            {

                Thread.sleep (10); // main thread sleep on other thread alive status, Sleep for 10 milliseconds
            }
            catch (InterruptedException e)
            {
            }
        System.out.println ("pi = " + mt.pi);
    }
}
class MyPIThread extends Thread
{
    boolean negative = true;
    double pi; // Initializes to 0.0, by default
    public void run ()
    {
        for (int i = 3; i < 1000000; i += 2)
        {
            if (negative)
                pi -= (1.0 / i);
            else
                pi += (1.0 / i);
            negative = !negative;
        }
        pi += 1.0;
        pi *= 4.0;
        System.out.println ("Finished calculating PI");
    }
}