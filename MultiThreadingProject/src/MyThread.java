// author muskansingal
/* Write a Java program to create multiple thread in Java.
    (Print even and Odd numbers)Set their name and prorities.*/
public class MyThread extends Thread {

	//method to work on threads
		public void run(){
			// method to print odd numbers less than 40
			System.out.println("odd number");
			for(int i=0;i<=50;i++){ 
				if(i%2!=0){  
					//thread work
					System.out.println(Thread.currentThread().getName()+"   "+i); 
					}  
					}  
			// method to print all even numbers less than 50
			System.out.println("even number");
			for(int i=0;i<=50;i++){  
				if(i%2==0){  
					System.out.println(Thread.currentThread().getName()+"   "+i);  
					}  
					}
		}
		// main method 
		public static void main(String[] args) {
			MyThread th1= new MyThread();
			MyThread th2= new MyThread();
			// method to set name of thread th1
			th1.setName("thread1");
			//method to set name of thread th2
			th2.setName("thread2");
			// method to set priority to run thread one first
			th1.setPriority(MAX_PRIORITY);
			th1.start();
			// method to set priority to run thread two after first
			th2.setPriority(MIN_PRIORITY);
			th2.start();

		
	}

}
