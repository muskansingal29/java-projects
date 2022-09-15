import java.util.List;

public  class Book implements Comparable<Book> {

	
	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return 0;
	}
	private	int bid;
	private	String subject;
	
	private void addAll(List<Book> list1) {
		// TODO Auto-generated method stub
	}
	public Book(int bid, String subject, String author) {
		super();
		this.bid = bid;
		this.subject = subject;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", subject=" + subject + ", author=" + author + "]";
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	private	String author;



	
		

	}

	

