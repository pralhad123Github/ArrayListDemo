package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		//by using iterator
		Iterator itr=al.iterator();//contains 10,20,30,40
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
