package ro.ase.cts.model;

import ro.ase.cts.exception.BookTypeNotAvailableException;
import ro.ase.cts.exception.InvalidPriceException;

public class Book {
	
	private String title;
	private BookType type;
	private float price;
	
	public Book() {
		
	}
	
	public Book(String title, BookType type, float price) {
		this.title=title;
		this.type=type;
		this.price=price;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BookType getType() {
		return type;
	}

	public void setType(BookType type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public float computeBookDiscount() throws BookTypeNotAvailableException, InvalidPriceException {
		float discount=0.0f;
		switch(this.type) {
		case BIOGRAPHY:
			discount=this.price * 0.2f;
			break;
		case HISTORY:
			discount=this.price * 0.3f;
			break;
		case FICTION:
			discount=this.price * 0.1f;
			break;
		case TECH:
			discount = this.price * 0.25f;
			break;
		case BUSINESS:
			discount = this.price * 0.15f;
			break;
		case SCIENCE:
			discount=this.price * 0.4f;
			break;
		default:
			throw new BookTypeNotAvailableException("Book type " + this.type.toString() + " is not available!");
		}
		
		return discount;
	}
}
