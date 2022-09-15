import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BookMap {

	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<>();
		map.put(101, "muskan");
		map.put(102, "poooja");
		map.put(103, "singal");
		map.put(104, "anjali");
		map.put(105, "dipanshi");
		
		Set<Integer> keys=map.keySet();
		for(Integer e:keys)
		{
			if( e.intValue()>101)
			{
			System.out.println(map.get(e));
		    }
		}
}
}
