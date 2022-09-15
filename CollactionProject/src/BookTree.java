import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class BookTree 
{

	public static void main(String[] args) throws Exception{
List <Book> List1=new ArrayList<Book>();
		
		Book b1=new Book(101,"english","william james");
		Book b2=new Book(102, "hindi","william ");
		Book b3=new Book(103,"math","james");
		
		List1.add(b1);
		List1.add(b2);
		List1.add(b3);

		System.out.println("..........First List..........\n");
		for(Book B:List1)
		{
			
			System.out.println(B);
		}
		
		
		List <Book> List2=new ArrayList<Book>();
		Book b4=new Book(104,"science","william james");
		Book b5=new Book(105, "physical education","william ");
		Book b6=new Book(106,"psychology","james");
		List2.add(b4);
		List2.add(b5);
		List2.add(b6);
	
	
	

	
	
	System.out.println("\n..........Second List..........\n");
	for(Book BB:List2)
	{
		
		System.out.println(BB);
	}


	
	TreeSet<Book> set = new TreeSet<>();
	
	set.add(b1);
	set.add(b2);
	set.add(b3);
	set.add(b4);
	set.add(b5);
	
	for(Book B:set)
	{
		
		System.out.println(B);
	}
	{
	System.out.println("First element of the array list: "+((List<Book>) set).get(0));
    System.out.println("Last element of the array list: "+((List<Book>) set).get(set.size()-1));
	}
	}
}

    