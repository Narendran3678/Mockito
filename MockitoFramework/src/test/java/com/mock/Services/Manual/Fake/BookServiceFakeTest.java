package com.mock.Services.Manual.Fake;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import com.mock.DAO.BookRepositoryImpl;
import com.mock.Entity.Books;
import com.mock.Services.BookServices;

public class BookServiceFakeTest 
{
	static BookServices service = new BookServices(new BookRepositoryImpl());
	@Test
	public void fakeTestSaveMethod()
	{
		Books books = new Books(1,"JavaBook",200.10, LocalDate.of(1996,8,21));
		
		Assert.assertTrue(service.saveBook(books)>0);
	}
	@Test
	public void fakeTestGetMethod()
	{
		Assert.assertTrue(service.getBookList().size()>0);
	}
}
