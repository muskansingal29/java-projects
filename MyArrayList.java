/*In this class MyArrayList we are adding random values to ArrayList named as al and then returning
 * the values*/
// class for method of array list
//author muskan singal
import java.util.ArrayList;

public class MyArrayList {
	//method myArrayListMain()
		public static ArrayList<Integer> myArrayListMain() {
			//creating the object al for ArrayList
			ArrayList<Integer> al=new ArrayList<Integer>();
			al.add(10);
			al.add(20);
			al.add(30);
			al.add(40);
			al.add(50);
			//returning the values of arraylist
			return al;	
		}
}
