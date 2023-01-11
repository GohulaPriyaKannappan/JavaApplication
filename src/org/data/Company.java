package org.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Company {
	public static void main(String[] args) {
		List<Integer> li= new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		System.out.println(li);
		int size = li.size();
		System.out.println(size);
		
		List<Integer> l = new LinkedList<Integer>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
		l.add(700);
        System.out.println(l);
		int size1 = l.size();
		System.out.println(size1);
		
		List<Integer> v = new Vector<Integer>();
		v.add(105);
		v.add(205);
		v.add(305);
		v.add(405);
		v.add(505);
		v.add(605);
		v.add(705);
		v.add(805);
		System.out.println(v);
		int size11 = v.size();
		System.out.println(size11);
		
		int indexOf=li.indexOf(10);
		System.out.println(indexOf);
		
		int lastIndexOf = li.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		int indexOf2 = li.indexOf(50);
		System.out.println(indexOf2);
		
		int indexOf3 = li.indexOf(90);
		System.out.println(indexOf3);
		
		Integer integer = li.get(2);
		System.out.println(integer);
		
		Integer integer1 = li.get(4);
		System.out.println(integer1);
		
		Integer integer11 = li.get(7);
		System.out.println(integer11);
		
		System.out.println("***For Loop***");
		for(int i=0;i<v.size();i++) {
			Integer integer111 = v.get(i);
			System.out.println(integer111);
		}
		
		System.out.println("***Enhanced Loop***");
		for(Integer v1:v) {
			System.out.println(v1);
		}
		
	}

}
