
// author muskan singal
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		String choice;
		Scanner sc= new Scanner(System.in);
		do {
		System.out.println("enter number:");
		int num =sc.nextInt();
		checkFactorial(num);
		System.out.println("do you want to continue check(yes/no):");
		choice=sc.next();
		}while(choice.equals("yes"));
		
	}
		static void checkFactorial(int n) {
		 
			int fact=1;
	        for(int i=1;i<=n;i++)
	        {
	            fact=fact*i;
	        }
	        System.out.println("Factorial of the number: "+fact);

		}
		
	}


