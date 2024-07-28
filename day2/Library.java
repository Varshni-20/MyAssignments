package week1.day2;

public class Library {

	 
		public  String addBook(String bookTitle ) {
			System.out.println("Book added successfully");
			return bookTitle;
			
			
			
		}
		public void issueBook() {
			System.out.println("Book issued Successfully");
			

	}
    public static void main(String args[]) {
    	Library l=new Library();
    	String obj=l.addBook("Twinkle");
    	System.out.println("Book Name"+obj);
    	l.issueBook();
	
	}

	

}
