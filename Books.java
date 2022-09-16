package collection.java;

 public class Books implements Comparable<Books>
{
	private int bid;
	private String subject;
	private String author;
	
	
	public Books() {
		super();
	
	}

	public Books(int bid, String subject, String author) 
	{
		super();
		this.bid = bid;
		this.subject = subject;
		this.author = author;
	}
	
	public final int getBid() {
		return bid;
	}

	public final void setBid(int bid) {
		this.bid = bid;
	}

	public final String getSubject() {
		return subject;
	}

	public final void setSubject(String subject) {
		this.subject = subject;
	}

	public final String getAuthor() {
		return author;
	}

	public final void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Books [bid=" + bid + ", subject=" + subject + ", author=" + author + "]";
	}

	@Override
	public int compareTo(Books o) {
		return this.author.compareTo(o.getAuthor());
	}
	

}
