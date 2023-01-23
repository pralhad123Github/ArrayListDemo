package com.arraylist;

import java.util.ArrayList;

//program for arraylist methods

public class ArrayListDemo6 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("pune");
		al.add("mumbai");
		al.add("bangalore");
		al.add(50);
		al.add(60);
		al.add(70);
		System.out.println(al.get(4));
		System.out.println(al.remove(1));
		System.out.println("After removing>>" + al);
		System.out.println(al.contains("mumbai"));
	}

}
