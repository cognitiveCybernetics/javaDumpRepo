package com.dipangshu.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Java1 {

	enum Example {ONE,TWO,THREE}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("hello2");
		Collection coll= new ArrayList();
		coll.add(Example.THREE);
		coll.add(Example.THREE);
		coll.add(Example.THREE);
		coll.add(Example.TWO);
		coll.add(Example.TWO);
		coll.add(Example.ONE);
		
		Set set=new HashSet(coll);
		
		Set set2=new TreeSet(coll);
		
		System.out.println("hello 2222");
		
		System.out.println("Java1.main()"+set);
		System.out.println("Java1.main()"+set2);

	}

}
