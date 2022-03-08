package com.java.MockitoTest;

public class SingletonHolderPattern
{
	//private static SingletonHolderPattern holder = new SingletonHolderPattern();
	
	private SingletonHolderPattern()
	{
		
	}
	private static class SingletonHolder
	{
		static SingletonHolderPattern SINGLETON_HOLDER_INSTANCE = new SingletonHolderPattern();
	}
	public static SingletonHolderPattern getInstance()
	{
		//return holder;
		return SingletonHolder.SINGLETON_HOLDER_INSTANCE;
	}
	public String sampleMethod()
	{
		return "Sample Method";
	}
}