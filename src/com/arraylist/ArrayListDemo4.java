package com.arraylist;

import java.util.ArrayList;

//Design ArrayList<Integer> using for each loop or for enhanced loop

public class ArrayListDemo4 {
	public static void main(String[] args) {
		ArrayList <Integer> al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		for(int i:al) {
			System.out.println(i);
		}
	}
	

}
