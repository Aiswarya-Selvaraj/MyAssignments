package week1.homeassignments;

public class Library {
public String addBook (String bookTitle) {
	System.out.println("Book added successfully : "+bookTitle);
	return bookTitle;
}
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library li = new Library();
		li.addBook("Maths Book");
		li.issueBook();

	}

}
