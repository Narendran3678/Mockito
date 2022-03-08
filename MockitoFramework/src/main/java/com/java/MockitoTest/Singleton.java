package com.java.MockitoTest;

public class Singleton 
{
	private static void SingletonHolder()
	{
		System.out.println("Singleton Holder Loading");
		System.out.println(SingletonHolderPattern.getInstance());
		System.out.println(SingletonHolderPattern.getInstance());
	}
	public static void main(String args[]) throws CloneNotSupportedException
	{
		SingletonHolder();	
	}
}