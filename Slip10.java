class Odd extends Thread
{
	public void run()
	{
	       for(int i=1 ; i<=10 ; i=i+2)
	       {
		System.out.print(i + "\t");
		try	
		{
		   Thread.sleep(1000);
		}catch(InterruptedException e)
		 {System.out.println("Error : " + e); }
	       }
	}
}
class Even extends Thread
{
	public void run()
	{
	       for(int i=2 ; i<=10 ; i=i+2)
	       {
		System.out.print(i + "\n");
		try	
		{
		   Thread.sleep(1000);
		}catch(InterruptedException e)
		 {System.out.println("Error : " + e); }

	       }
	}
}
class Slip10
{
   public static void main(String arg[])
   {
       Odd o = new Odd();
       Even e = new Even();
       o.setPriority(10);
       e.setPriority(5);
       o.start();
       e.start();	
   }
}

