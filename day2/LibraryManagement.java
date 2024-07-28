package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		Library l=new Library();
    	String obj=l.addBook("Twinkle");
    	System.out.println("Book Name"+obj);
    	l.issueBook();
	

	}

}
