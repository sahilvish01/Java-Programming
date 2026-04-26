// Create treads by Implementing Runnable Interface
class CustomThread2 implements Runnable
{
    Thread t1;

    CustomThread2(String name)
    {
        t1 = new Thread(this, name);
        t1.start();
    }

    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(t1.getName() + ": " + i);

            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ie) {}
        }
    }

    public static void main(String [] args)
    {
        CustomThread2 ct1 = new CustomThread2("Thread 1");
        CustomThread2 ct2 = new CustomThread2("Thread 2");
        CustomThread2 ct3 = new CustomThread2("Thread 3");
        CustomThread2 ct4 = new CustomThread2("Thread 4");
        CustomThread2 ct5 = new CustomThread2("Thread 5");

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Main Thread : " + i);
            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ie) {}
        }
    }
}