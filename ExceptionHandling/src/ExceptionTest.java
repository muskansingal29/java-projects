import java.util.Scanner;
import java.lang.Exception;

public class ExceptionTest {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		{
			System.out.println("enter two no");
			String s1=Sc.nextLine();
			String s2=Sc.nextLine();
			try
			{
				int a=Integer.parseInt(s1);
			    int b=Integer.parseInt(s2);
			    int c=a/b;
			    System.out.println("divided by zero a&b:"+c);
			    
			}
			catch(NumberFormatException ef)
			{
				System.out.println("format mismatch");
			}
			catch(Exception e)
			{
				System.out.println("invalid exception"+e);
			}
			finally
			{
				System.out.println("exception caught");
			}
		}
		System.out.println("exception handled");
			

	}

}
