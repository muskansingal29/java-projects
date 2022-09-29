// Author muskan
	//Write a Java program to find the longest word in a text file.


import java.util.ArrayList;

	import java.util.Arrays;
public class LongestWord {
	
	// Author muskan
	//Write a Java program to find the longest word in a text file.
	

	// method for longest word in the string
		static ArrayList<String> longestWords(String[] TextFile) {
			
	        ArrayList<String> list = new ArrayList<String>();
	        int longest_length = 0;
	        // for loop
	        for (String str : TextFile) {
	            int length = str.length();
	            // condition for longest lenght string
	            if (length > longest_length) {
	                longest_length = length;
	                list.clear();
	            }
	            if (length == longest_length) {
	                list.add(str);
	            }
	        }
	        return list;
	    }
	    
	public static void main(String[] args) {
			// string
			String [] TextFile = {"iamadeveloper", "name", "class", "place", "am"};
			System.out.println("Original TextFile: "+Arrays.toString(TextFile));
			System.out.println("Longest word(s) of the above dictionary: "+longestWords(TextFile));
	}

	}
