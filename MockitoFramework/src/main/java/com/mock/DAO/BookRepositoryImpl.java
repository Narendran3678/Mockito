package com.mock.DAO;

import java.util.*;

import com.mock.Entity.Books;

public class BookRepositoryImpl implements BookRepository
{	
	static private Map<String,Books> bookList = null;
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
		if(bookList==null)
		{
			bookList = new HashMap<String,Books>();
		}
		bookList.put(book.getTitle(), book);
		return bookList.size();
	}

	@Override
	public Map<String,Books> getBookList() {
		
		return bookList;
	}

}
