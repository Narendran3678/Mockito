package com.mock.DAO;

import java.time.LocalDate;
import java.util.*;

import com.mock.Entity.Books;

public class BookRepositoryImpl implements BookRepository
{	
	static private Map<String,Books> bookList = new HashMap<String,Books>();
	
	public BookRepositoryImpl()
	{
		
	}
	@Override
	public int saveBook(Books book) 
	{
		if(book==null)
		{
			return 0;
		}
		bookList.put(book.getTitle(), book);
		return bookList.size();
	}

	@Override
	public Map<String,Books> getBookList() {
		
		return bookList;
	}
	@Override
	public Map<String, Books> getNewBooks() {
		Map<String,Books> newBook = new HashMap<String,Books>();
		Books books = new Books(1,"JavaBook",200.10, LocalDate.of(1996,6,21));
		Books books1 = new Books(1,"PythonBook",210.10, LocalDate.of(2000,12,16));
		Books books2 = new Books(1,"C#Book",150.10, LocalDate.of(1997,9,3));
		newBook.put(books.getTitle(), books);
		newBook.put(books1.getTitle(), books1);
		newBook.put(books2.getTitle(), books2);
		return newBook;
	}
	
}
