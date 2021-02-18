package Book;

public class Chpter4_201p {

	static class Book {
		String title;
		String author;
		int ISBN;
		
		public Book(String title, String author, int ISBN) {
			this.title = title;
			this.author = author;
			this.ISBN = ISBN;
		}
		
		public Book(String title, int ISBN) {
			this(title, "Anonymous", ISBN);
		}
		
		public Book() {
			this(null,null,0);
			System.out.println("The constructor has been called");
		}
		
	}
	
	public static void main(String[] args) {
		Book javaBook = new Book("Java JDK", "Mr.Kim", 1234);
		Book holyBible = new Book("Holy Bible", 1);
		Book emptyBook = new Book();
		
		System.out.println("javaBook: " + javaBook.title + " / author: "+ javaBook.author + " / ISBN: " + javaBook.ISBN);
	    System.out.println("holyBible: "+ holyBible.title + " / author: "+ holyBible.author + " / ISBN: " + holyBible.ISBN);
	    System.out.println("emptyBook: "+ emptyBook.title + " / author: "+ emptyBook.author + " / ISBN: " + emptyBook.ISBN);
		

	}

}
