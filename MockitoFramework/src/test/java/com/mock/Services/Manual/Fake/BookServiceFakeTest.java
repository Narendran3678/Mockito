package com.mock.Services.Manual.Fake;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.java.MockitoTest.SingletonHolderPattern;
import com.mock.DAO.BookRepository;
import com.mock.DAO.BookRepositoryImpl;
import com.mock.Entity.Books;
import com.mock.Services.BookServices;

public class BookServiceFakeTest 
{
	static BookServices mockServices = Mockito.mock(BookServices.class);
	static BookServices service = new BookServices(new BookRepositoryImpl());
	
	@Test
	public void fakeTestSaveMethod()
	{
		Books books = new Books(1,"JavaBook",200.10, LocalDate.of(1996,8,21));
		Assert.assertTrue(service.saveBook(books)>0);
		

		//Mockito.verify(mockServices).saveBook(books);
	}
	@Test
	public void fakeTestGetMethod()
	{
		Assert.assertNotNull(service.getBookList());
	}
	@Test
	public void stubTestManualMethod()
	{
		Assert.assertEquals(3,service.getBookPriceDiscount().size());
	}

	@Test
	public void fakeTestMockSaveMethod()
	{
		Books books = new Books(1,"JavaBook",200.10, LocalDate.of(1996,8,21));
		Mockito.when(mockServices.saveBook(books)).thenReturn(1);
		Assert.assertTrue(service.saveBook(books)>0);
	}
	@Test
	public void fakeTestMockGetMethod()
	{
		Books books = new Books(1,"JavaBook",200.10, LocalDate.of(1996,8,21));
		Map<String,Books> bookList = new HashMap<String,Books>();
		bookList.put(books.getTitle(),books);
		Mockito.when(mockServices.getBookList()).thenReturn(bookList);
		Assert.assertNotNull(mockServices.getBookList());
		Assert.assertTrue(mockServices.getBookList().size()>0);
	}
	@Test
	public void stubTestMockMethod()
	{
		BookRepository bookRep= Mockito.mock(BookRepository.class);
		BookServices service = new BookServices(bookRep);
		Map<String,Books> newBook = new HashMap<String,Books>();
		Books books = new Books(1,"JavaBook",200.10, LocalDate.of(1996,6,21));
		Books books1 = new Books(1,"PythonBook",210.10, LocalDate.of(2000,12,16));
		Books books2 = new Books(1,"C#Book",150.10, LocalDate.of(1997,9,3));
		newBook.put(books.getTitle(), books);
		newBook.put(books1.getTitle(), books1);
		newBook.put(books2.getTitle(), books2);
		
		
		Mockito.when(bookRep.getNewBooks()).thenReturn(newBook);		
		Assert.assertEquals(3,service.getBookPriceDiscount().size());
		
		
	}
	private SingletonHolderPattern pattern;
	@Before
	public void beforeMethod() 
	{
		System.out.println("Before Method");
		pattern = SingletonHolderPattern.getInstance();
	}
	@Test
	public void singletonTestMethod() {
		System.out.println("singletonTestMethod.."+pattern.sampleMethod());
		Assert.assertEquals("Sample Method",pattern.sampleMethod());
	}
	
}
