import java.util.Scanner;

public class StringCount {
	void display()
	
	{
		int count = 0;
		Scanner s=new Scanner(System.in);
        System.out.print(" Enter a Strig =  ");
		String sc = s.nextLine();
			for(int i=0;i<sc.length(); i++) {  
	            if(sc.charAt(i)!= ' ') 
	            {
	                count++; 
	            }
			}
			System.out.println("Total number of characters in a string: " + count);  
			}
		public static void main(String[] args) {
			StringCount obj=new StringCount();
			obj.display();
		}
		}
		
	
