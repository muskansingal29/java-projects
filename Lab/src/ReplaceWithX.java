import java.util.Scanner;
public class ReplaceWithX {

	
	
	public static void main(String[] args) throws Exception {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string ");
	String inputString = sc.nextLine();
	if (inputString.length() > 4) {
	String allExceptLast4 = inputString.substring(0, inputString.length()-4);
	String repeatString = "X".repeat(allExceptLast4.length());
	repeatString +=  inputString.substring(inputString.length()-4);
	System.out.println(repeatString);
	}
	else {
	System.out.println("Entered string must be greater than 4.");
	}
	}

	}


