package com.paiyue.testmaven;

/** Fibonacci
 *  Displays a sequence fibonacci number according to input number
 * @author 
 * @version 
 */

public class Fibonacci {
	/** Entrv point to class
	 *  @param args array of string
	 */
	public static void main(String args[]){
//		if(args==null||args.length<1){
//			System.out.println("请输入参数..");
//			return;
//		}
//		int one=Integer.parseInt(args[0]);
		int start1=1;
		int start2=1;
		System.out.print(start1);
		while(start2<=20){
			System.out.print(" "+start2);
			int temp=start1;
			start1=start2;
			start2=temp+start2;
		}
	}
}
