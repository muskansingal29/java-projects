//Write a program for to check a palindrome string.
//Write test cases for 4 different parameters (use @parametrizedTest annotaion).

public class Palindrome {
// method for pallindrome string
	public static boolean isPalindrome(String str){  
		//string builder 
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    String rev=sb.toString();  
	    if(str.equals(rev)){  
	        return true;  
	    }else{  
	        return false;  
	    }  
	}

	
}