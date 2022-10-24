import java.util.*;
import java.io.*;

public class GFG {
    public static void main(String[]args) {
        //System.out.println();
		// creating the objects of class Book
        Book b1 = new Book("Effective Java", "Joshua Block");
        Book b2 = new Book("Thining in Java", "Buce Eckel");
        Book b3 = new Book("Java:Complere Reference", "Herbert Shildt");
		
		List<Book> book = new ArrayList<Book>();
		
		// adding books to List object
		book.add(b1);
		book.add(b2);
		book.add(b3);
		
		
		Library library = new Library(book);
		
		//1.called method of class Lebrary and storing list of books in...
		//2. ...List is declared of type of Book
		List<Book> books = library.getListOfBooksInLibrary();
		
		for(Book bk:books)
			System.out.println("Title: " + bk.title +  "\tAuthor: " + bk.author + "\n");
    }
}

class Book {
    public String author;
    public String title;
    Book(String title,String author) {
        this.author = author;
        this.title = title;
    }
}
class Library {
	//code
    private final List <Book> books;
    Library(List <Book> books) {
        this.books = books;
    }
    public List <Book> getListOfBooksInLibrary() {
        return books;
    }

}
