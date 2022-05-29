package myCRUDappRMZ.model;

public class Book {
	private int bookid;
	private int personOwnerId;
	private String title;
	private String author;
	private int year;
	
	public Book(){
	
	}
	
	
	
	public Book(String title, String author, int year, int bookid){
		this.author = author;
		this.title = title;
		this.year = year;
		this.bookid = bookid;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setBookid(int bookid){
		this.bookid = bookid;
	}
	
	public int getBookid(){
		return bookid;
	}
	
	public int getPersonOwnerId() {
		return personOwnerId;
	}
	
	public void setPersonOwnerId(int personOwnerId) {
		this.personOwnerId = personOwnerId;
	}
	
	@Override
	public String toString() {
		return "Book{" +
				"bookid=" + bookid +
				", title='" + title + '\'' +
				", author='" + author + '\'' +
				", year=" + year +
				"peronOwner" + personOwnerId +
				'}';
	}
}
