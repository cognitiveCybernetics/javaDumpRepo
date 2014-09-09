package com.dipangshu.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Java1 {

	enum Example {ONE,TWO,THREE}
	
	public static void main(String[] args) {
		
		Collection coll= new ArrayList();
		coll.add(Example.THREE);
		coll.add(Example.THREE);
		coll.add(Example.THREE);
		coll.add(Example.TWO);
		coll.add(Example.TWO);
		coll.add(Example.ONE);
		
		Set set=new HashSet(coll);
		
		
		
		System.out.println("Java1.main()"+set);

	}

}
