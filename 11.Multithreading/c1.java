// Create treads by extending thread class

class CustomThread1 extends Thread
{
    CustomThread1(String name)
    {
        super(name);
    }

    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(getName() + ": " + i);

            try
            {
                Thread.sleep(100);
            }
            catch(InterruptedException ie) {}
        }
    }

    public static void main(String[] args)
    {
        CustomThread1 ct1 = new CustomThread1("Thread1");
        CustomThread1 ct2 = new CustomThread1("Thread2");
        CustomThread1 ct3 = new CustomThread1("Thread3");
        CustomThread1 ct4 = new CustomThread1("Thread4");
        CustomThread1 ct5 = new CustomThread1("Thread5");
        
        ct1.start();
        ct2.start();
        ct3.start();
        ct4.start();
        ct5.start();

        for(int i = 1; i <= 2; i++)
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

