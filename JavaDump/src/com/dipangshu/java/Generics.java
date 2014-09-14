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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((object == null) ? 0 : object.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Generics other = (Generics) obj;
		if (object == null) {
			if (other.object != null)
				return false;
		} else if (!object.equals(other.object))
			return false;
		return true;
	}
	
	

}
