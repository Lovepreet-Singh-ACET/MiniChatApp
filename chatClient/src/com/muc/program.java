class ABC extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<20;i++)
            {
                System.out.println("A");
                Thread.sleep(200,900);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class program
{
    public static void main(String [] args)
    {
        ABC m[]=new ABC[4];
        for(int i=0;i<m.length;i++)
        {
            m[i].start();
        }
        try
        {
            for(int i=0;i<m.length;i++)
            {
                m[i].join();
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        System.out.println("ALL Threads are completed");
    }
}
