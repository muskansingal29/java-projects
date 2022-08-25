
public class String {

	// TODO Auto-generated method stub//	logic for printing booth array values in the form of a table
//	first accepting booth array value
	static void joinArr(String s[],int arr[])
	{
		System.out.println("Names\tValues\n");
		for(int i=0;i<s.length;i++)
		{
				System.out.println(s[i]+"\t"+arr[i]);
		}
	}

//	main method is begins
	public static void main(String[] args) {
//		Array of names
		String st[] = {"Peter","Amy","John","Boyd","Cathy"};
		
//		Array of Values
		int a[] = {15,9,14,10,12};
		
//		Calling method - there is no need to create instance(obj) because method is static
		joinArr(st,a);

	}

}
