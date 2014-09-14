package com.dipangshu.java;

import java.util.ArrayList;
import java.util.List;

public class Generics<T> {

	private T object;
	
	public Generics(T Object){
		this.object=Object;
	}	
	public T getObject(){		
		return object;
	}
	
	public static void main(String[] args) {
	
		Generics<String> str=new Generics<String>("Ans :");
		Generics<Integer> ins=new Generics<Integer>(42);
		
		System.out.println(str.getObject()+ins.getObject());

	}
	
	public static void takeList(List<? extends String> list){		
		//list.add("foo"); //The method add(capture#1-of ? extends String) in the type List<capture#1-of ? extends String> is not applicable for the arguments (String)
		list= new ArrayList<String>();
		//list= new ArrayList<Object>();//Type mismatch: cannot convert from ArrayList<Object> to List<? extends String>
		String s=list.get(0);
		Object o=list;
	}

}
