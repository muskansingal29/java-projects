import java.util.ArrayList;
import java.util.List;




public class BookList {

	public static void main(String[] args) {
		List <Book> List1=new ArrayList<Book>();
		
		Book b1=new Book(101,"english","william james");
		Book b2=new Book(102, "hindi","william ");
		Book b3=new Book(103,"math","james");
		
		List1.add(b1);
		List1.add(b2);
		List1.add(b3);
		
		 for(Book b:List1) System.out.println(b);

		
		List <Book> List2=new ArrayList<Book>();
		Book b4=new Book(104,"science","william james");
		Book b5=new Book(105, "physical education","william ");
		Book b6=new Book(106,"psychology","james");
		
		List2.add(b4);
		List2.add(b5);
		List2.add(b6);
		
		 for(Book b:List2) System.out.println(b);
	}

}

