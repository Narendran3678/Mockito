package com.mock.DAO;

import java.util.*;

import com.mock.Entity.Books;

public interface BookRepository {
	public int saveBook(Books book);
	public Map<String,Books> getBookList();
	public Map<String,Books> getNewBooks();
}
