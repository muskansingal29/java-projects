import java.io.FileWriter;
	import java.io.IOException;

	//Write a Java program to append text to an existing file.
public class AppendFile {
	
	
		public static void main(String[] args) {
			//try catch block for the statement
			try
		      {
				//OUTPUT STREAM METHOD-write method used to write in the file
		         FileWriter fw = new FileWriter("Demo.txt", true);
		         // to append in the file
		         fw.write("\nI'm the new content.");
		         fw.close();
		         System.out.println("The content is successfully appended to the file.");
		      }
		      catch(IOException ioe)
		      {
		    	  //if something is wrong
		         System.out.print("\nSomething went wrong!");
		      }

		}

	
}
