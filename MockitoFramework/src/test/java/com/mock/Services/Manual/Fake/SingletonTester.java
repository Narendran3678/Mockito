package com.mock.Services.Manual.Fake;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.java.MockitoTest.SingletonHolderPattern;
public class SingletonTester 
{
	private SingletonHolderPattern pattern;
	@Before
	public void beforeMethod() 
	{
		System.out.println("Before Method");
		pattern = SingletonHolderPattern.getInstance();
	}
	@Test
	public void singletonTestMethod() {
		Assert.assertEquals("Sample Method",pattern.sampleMethod());
	}

}
