// author- muskan singal
/*Write a JAVA program which will generate two threads:(Use Synchronization)

- To display 10 terms of Fibonacci series.
- To display 1 to 10 in reverse order.

*/
class Number extends Thread
{
	// synchronized method to print fiboseries and reverse no sequencialy on console
	synchronized	 public void fiboSeries()  {
		// method for fibonacci series no's
	    int n = 10, a = 0, b = 1;
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.println(a + ", ");

	      // compute the next term
	      int nextTerm = a + b;
	      a = b;
	      a = nextTerm;
	}
	}
	    synchronized public void revNum()
	    {
	    	// method to present revers number
	    	System.out.println("revers number series");
	    	for(int i=20;i>=1;i--)
	    		System.out.println(i);
	    }
}

class Thread1 extends Thread{
	Number n;
	public Thread1(Number n) {
		this.n=n;
	}
	public void run() {
		n.fiboSeries();
	}
	
}
class Thread2 extends Thread{
	Number n;
	public Thread2(Number n) {
		this.n=n;
	}
	public void run() {
		n.revNum();
	}
	
}
// main method
public class FiboRevThread {

	public static void main(String[] args) {
		Number num1=new Number();
		// thread object
		Thread1 th1=new Thread1(num1);
		Thread2 th2=new Thread2(num1);
		// method to start a thread 
		th1.start();
		th2.start();


	}

}
