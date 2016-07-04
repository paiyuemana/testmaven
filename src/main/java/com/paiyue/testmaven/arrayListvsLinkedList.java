package com.paiyue.testmaven;

//: object/HelloDate.java
import java.util.*;

/** The first Thinking in Java
 *  Displays a string and today's date.
 * @author paiyue
 * @version 4.0
 */

public class arrayListvsLinkedList {
	/** Entrv point to class
	 *  @param args array of string
	 */
	public static void main(String[] args){
//		System.out.println(Integer.toBinaryString(-2));
		//1010 0101
		int x=0xAAAAAAAA;
		int y=0x55555555;
		int t=0x80000000;
		int z=x|y;
		System.out.println(Integer.toBinaryString(z));
		String str="";
		while(t!=0){
			str=str+(((z&t)==0)?0:1);
			t=t>>>1;
			System.out.println(Integer.toBinaryString(t));
		}
		System.out.println(str);
	}
} /* Output: (55% match)
Hello, it's
Wed Oct 05 14:39:36
*///:~

