package com.dipangshu.java;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Java4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 List list = new ArrayList();
		 list.add("1"); 
		 list.add("2"); 
		 list.add("3");
		 System.out.println(list instanceof Iterable);
		 
		
//		 for (Object obj: reverse(list)){ //Can only iterate over an array or an instance of java.lang.Iterable
//			 System.out.print(obj + ", ");
//		 }
		 
	}
	
	public static Iterator reverse(List list){		// we need to change return type as list
		Collections.reverse(list);		
		return list.iterator();
	}

}
