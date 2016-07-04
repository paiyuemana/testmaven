package com.paiyue.testmaven;

//: object/ccc.java
import java.util.*;

/** The first Thinking in Java
*  Displays a string and today's date.
* @author paiyue
* @version 4.0
*/

public class ccc {
	/** Entrv point to class
	 *  @param args array of string
	 */
	public static void main(String[] args){
		ConnectionManager cm=ConnectionManager.getConnectionManager();
		cm.f();
		ConnectionManager cm2=ConnectionManager.getConnectionManager();
		cm2.f();
		ConnectionManager cm3=ConnectionManager.getConnectionManager();
		cm3.f();
		ConnectionManager cm4=ConnectionManager.getConnectionManager();
		cm4.f();
	}
} /* Output: (55% match)
Hello, it's
Wed Oct 05 14:39:36
*///:~

