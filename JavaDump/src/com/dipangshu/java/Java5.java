package com.dipangshu.java;

import java.util.LinkedList;
import java.util.List;

public class Java5 {
	
	 public static Object get0(List list) {
		 return list.get(0);	
	 }
	
	
	public static void main(String[] args) {
		 Object o = Java5.get0(new LinkedList());
//		 Object o1 = Java5.get0(new LinkedList<?>());//Cannot instantiate the type LinkedList<?>
//		 String s = Java5.get0(new LinkedList<String>()); //Type mismatch: cannot convert from Object to String
	     Object o2 = Java5.get0(new LinkedList<Object>());
		 String s1 = (String)Java5.get0(new LinkedList<String>());

	}

}
