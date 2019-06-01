package com.docavenue.recruitmenttest.viseo;

public class Singleton {

	/**
	 * Private constructor
	 *
	 *
	 * Prevents the constructor call to external code
	 */
	private Singleton() {

	}

	/**
	 * Private Static instance
	 */
	private static Singleton uniqueInstance = new Singleton();

	/**
	 * Static accessor accessible to external code
	 * 
	 * @return
	 */
	public static Singleton getInstance() {
		return uniqueInstance;
	}

}
