package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import java.util.List;



public class Demolist {

	public static void main(String[] args) {
		List<Integer> value=new ArrayList<>();
		value.add(20);
		value.add(66235);
		value.add(596);
		value.add(652);
		value.add(1,30);
		value.remove(2);
		//Collection.sort(value);
		value.forEach(System.out::println);
		
		Iterator i=value.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		}
		
		
		for(int p:value)
		{
			System.out.println(p);
		}

	}

}
