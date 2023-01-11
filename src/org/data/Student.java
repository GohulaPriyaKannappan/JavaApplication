package org.data;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public static void main(String[] args) {
		List<Integer> li= new ArrayList<Integer>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		System.out.println(li);
		
		li.set(2,350);
		System.out.println(li);
		
		List<Integer> l= new ArrayList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);
		l.add(10);
		l.add(40);
		l.add(50);
		l.add(10);
		System.out.println(l);
		
		l.set(7,90);
		System.out.println(l);
		
		
	}

}
