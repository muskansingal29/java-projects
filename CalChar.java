/* 
 * This Java Example shows how to calculate total number of char in a string.
 */
//author muskan singal
public class CalChar {

	public static void main(String[] args) {
		String text = "my name is muskan singal!";  
        int count = 0;  
          
        //Count every character except space
        for(int i = 0; i < text.length(); i++) {  
            if(text.charAt(i) != ' ')  
                count++;  
        }  
        System.out.println("Total number of characters is: " +count); 

	}

}
