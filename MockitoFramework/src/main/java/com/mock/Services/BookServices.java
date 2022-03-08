package com.mock.Services;
import java.util.*;
import com.mock.DAO.BookRepository;
import com.mock.Entity.Books;

public class BookServices 
{
	private BookRepository bookImpl;
	public BookServices(BookRepository bookImpl)
	{
		this.bookImpl=bookImpl;
	}
	public int saveBook(Books book) 
	{
		return bookImpl.saveBook(book);
	}
	
	public Map<String,Books> getBookList() {
		
		return bookImpl.getBookList();
	}
	public Map<String,Books> getBookPriceDiscount()
	{
		Map<String,Books> newBooks = new HashMap<String,Books>();
		for(Map.Entry<String,Books> entry:bookImpl.getNewBooks().entrySet())
		{
			Books eB= entry.getValue();
			eB.setPrice(eB.getPrice()-50);
			newBooks.put(eB.getTitle(),eB);
		}
		return newBooks;
	}
	public void verify()
	{
		
	}
}
