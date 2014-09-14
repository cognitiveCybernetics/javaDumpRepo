package com.dipangshu.java;


import java.util.ArrayList;
import java.util.List;

public class Java3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
    ArrayList<String> x1= new ArrayList<String>();
//    foo(x1);//he method foo(List<Object>) in the type Java3 is not applicable for the arguments (ArrayList<String>)
	
   
   ArrayList<Object> x2=new ArrayList<Object>();
   foo(x2);
   
//   ArrayList<Object> x3=new ArrayList<String>();//Type mismatch: cannot convert from ArrayList<String> to ArrayList<Object>
//   foo(x3); 
   
    ArrayList x4=new ArrayList();
    foo(x4);
    
	}

	public static void foo(List<Object> list){
		
	}
}
