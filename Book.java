package collection.java;

	public class Book implements Comparable<Book>
	{
		private int bid;
		private String subject;
		private String author;
		
		
		public Book() {
			super();
		
		}

		public Book(int bid, String subject, String author) 
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
		public 	int compareTo(Book o) {
			return this.bid-o.getBid();
		}

				
}
