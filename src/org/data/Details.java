package org.data;

import java.util.ArrayList;
import java.util.List;

public class Details {
	public static void main(String[] args) {
		List<Integer> li= new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(10);
		System.out.println(li);
		List<Integer> l= new ArrayList<Integer>();
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(80);
		System.out.println(l);
		li.retainAll(l);
		System.out.println(li);
		
		List<Integer> v= new ArrayList<Integer>();
		v.add(10);
		v.add(20);
		v.add(60);
		v.add(50);
		v.add(40);
		v.add(70);
		v.add(80);
		v.add(90);
		System.out.println(v);
		li.retainAll(v);
		System.out.println(li);
		
		List<Integer> a= new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		a.add(70);
		a.add(80);
		System.out.println(a);
		
		List<Integer> b= new ArrayList<Integer>();
		b.add(100);
		b.add(200);
		b.add(300);
		b.add(400);
		b.add(500);
		b.add(600);
		b.add(700);
		b.add(800);
		System.out.println(b);
		a.retainAll(b);
		System.out.println(a);
		
		li.removeAll(l);
		System.out.println(li);
		
		li.removeAll(v);
		System.out.println(li);
		
		a.removeAll(b);
		System.out.println(a);
		
	}

}
