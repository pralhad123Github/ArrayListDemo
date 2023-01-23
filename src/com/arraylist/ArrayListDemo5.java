package com.arraylist;

import java.util.ArrayList;

public class ArrayListDemo5 {
	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<String>();
		al.add("pune");
		al.add("mumbai");
		al.add("bangalore");
		for(String s:al) {
			System.out.println(s);
		}
	}

}
