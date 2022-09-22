/*Apply InterThread Communication on demand and supply model.
  Create a class Producer with one data member int availableProduct and 
  two methods --demand() and supply().
  Create two threads . In the run() of first thread call demand(int n) and 
  In the run() of second thread call supply(int n).If deamnding number is gretaer than availableProduct
  consumer should wait till supply increases the availableProduct.*/
// Author muskan singal
public class ThreadCommunication {
	int availableProduct=10;
	// method for demand
	synchronized public void demandMethod(int avail)
	{
		if(availableProduct<avail) 
		{
			try {
				wait(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
			availableProduct-=avail;
			System.out.println("Demand product......"+availableProduct);
		}
	// method for supply
	synchronized public void supplyMethod(int i)
	{
		availableProduct+=i;
		System.out.println("supply product........"+availableProduct);

		notify();
	}
}
// create classes for thread 
class MyThreadX extends Thread{
	ThreadCommunication tc;
	MyThreadX(ThreadCommunication tc)
	{
		this.tc=tc;
	}
	public void run()
	{
		tc.demandMethod(2);
	}
}class MyThreadY extends Thread{
	ThreadCommunication tc;
	MyThreadY(ThreadCommunication tc)
	{
		this.tc=tc;
	}
	public void run()
	{
		tc.supplyMethod(3);
	}
 
// main method
	public static void main(String[] args) {
		
		ThreadCommunication tc=new ThreadCommunication();
			MyThreadX th=new MyThreadX(tc);
			MyThreadY th1=new MyThreadY(tc);
			th.start();
			th1.start();

	}

}
