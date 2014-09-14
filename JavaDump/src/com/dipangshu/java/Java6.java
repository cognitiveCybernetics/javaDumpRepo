package com.dipangshu.java;

import java.util.LinkedList;
import java.util.List;

class A{}
class B extends A {}


public class Java6 {

	
	public static void main(String[] args) {
		
		List<A> listA=new LinkedList<A>();
		List<B> listB=new LinkedList<B>();
		List<Object> listO=new LinkedList<Object>();

		
		
	}

	public static void m1(List <? extends A> list){}
	public static void m2(List<A> list){}
	
}
