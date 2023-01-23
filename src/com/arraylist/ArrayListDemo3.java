package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

//copy the data from one arraylist into the another arraylist

public class ArrayListDemo3 {
	public static void main(String[] args) {
		// create the object of Arraylist
		ArrayList <Integer> al1= new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		ArrayList <Integer> al2= new ArrayList();
		al2.add(40);
		al2.add(50);
		al2.add(60);
		
		al1.addAll(al2); //use addAll method to copy
		
		
		//use Iterator
		Iterator itr =al1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
