package ro.ase.cts.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import ro.ase.cts.exception.BookTypeNotAvailableException;
import ro.ase.cts.exception.InvalidPriceException;
import ro.ase.cts.model.Book;
import ro.ase.cts.model.BookType;

public class BookTests {
	@Test
	public void testDiscountForBiography() {
		Book book = new Book("Book 1", BookType.BIOGRAPHY, 100.0f);
		try {
			assertEquals(20.0f, book.computeBookDiscount(), 0.001);
		} catch (BookTypeNotAvailableException e) {
			System.out.println(e.getMessage());
		} catch(InvalidPriceException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testDiscountForHistory() {
		Book book = new Book("Book 2", BookType.HISTORY, 80.5f);
		try {
			assertEquals(24.15f, book.computeBookDiscount(), 0.001);
		} catch (BookTypeNotAvailableException e) {
			System.out.println(e.getMessage());
		}catch(InvalidPriceException e) {
			System.out.println(e.getMessage());
		}	
	}
	
	@Test
	public void testDiscountForFiction() {
		Book book = new Book("Book 3", BookType.FICTION, 130.0f);
		try {
			assertEquals(13.0f, book.computeBookDiscount(), 0.001);
		} catch (BookTypeNotAvailableException e) {
			System.out.println(e.getMessage());
		}catch(InvalidPriceException e) {
			System.out.println(e.getMessage());
		}		
	}
	
	@Test
	public void testDiscountForTech() {
		Book book = new Book("Book 4", BookType.TECH, 250.0f);
		try {
			assertEquals(62.5f, book.computeBookDiscount(), 0.001);
		} catch (BookTypeNotAvailableException e) {
			System.out.println(e.getMessage());
		}catch(InvalidPriceException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testDiscountForBusiness() {
		Book book = new Book("Book 5", BookType.BUSINESS, 180.5f);
		try {
			assertEquals(27.07f, book.computeBookDiscount(), 0.001);
		} catch (BookTypeNotAvailableException e) {
			System.out.println(e.getMessage());
		}catch(InvalidPriceException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testDiscountForNegativePrice() {
		Book book = new Book("Book 6", BookType.TECH, -250.0f);
		try {
			book.computeBookDiscount();
			fail("Price cannot be negative");
		} catch (BookTypeNotAvailableException | InvalidPriceException e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testDiscountForComics() {
		Book book = new Book("Book 7", BookType.COMICS, 50.0f);
		try {
			book.computeBookDiscount();
			fail("The specified type is not available!");
		} catch (BookTypeNotAvailableException e) {
			System.out.println(e.getMessage());
		}catch(InvalidPriceException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testDiscountForPersonalDevelopment() {
		Book book = new Book("Book 8", BookType.PERSONAL_DEVELOPMENT, 50.0f);
		try {
			book.computeBookDiscount();
			fail("The specified type is not available!");
		} catch (BookTypeNotAvailableException e) {
			System.out.println(e.getMessage());
		}catch(InvalidPriceException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void testDiscountForCooking() {
		Book book = new Book("Book 9", BookType.COOKING, 35.0f);
		try {
			assertEquals(14.0f, book.computeBookDiscount(), 0.001);
		} catch (BookTypeNotAvailableException e) {
			System.out.println(e.getMessage());
		}catch(InvalidPriceException e) {
			System.out.println(e.getMessage());
		}	
	}
	
	@Test
	public void testDiscountForScience() {
		Book book = new Book("Book 10", BookType.SCIENCE, 100.0f);
		try {
			assertEquals(10.0f, book.computeBookDiscount(), 0.001);
		} catch (BookTypeNotAvailableException e) {
			System.out.println(e.getMessage());
		}catch(InvalidPriceException e) {
			System.out.println(e.getMessage());
		}	
	}
}
