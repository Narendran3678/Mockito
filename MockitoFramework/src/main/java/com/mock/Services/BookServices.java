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
}
