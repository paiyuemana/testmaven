package com.paiyue.testmaven;

public class ConnectionManager {
	private ConnectionManager(){}
	private static ConnectionManager[] arr= new ConnectionManager[]{new ConnectionManager()
																				,new ConnectionManager(),new ConnectionManager()};
	private static int index=3;
	private static int classNum=3;
	public static ConnectionManager getConnectionManager(){
		if(index==0){
			return null;
		}
		index--;
		return arr[index];
	}
	public void f(){
		System.out.println("第"+(classNum-index)+"个实例，剩余"+index+"个实例");
	}
}