package com.java.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class ListDemo1 {

	public static void main(String[] args)
	{
		List<Integer> listOfNumbers=new ArrayList<>();
		for(int i=0;i<20;i++)
		{
			listOfNumbers.add(i);
		}
		listOfNumbers.removeIf(n->n%3==0);
		System.out.println("Using toString()");
		System.out.println(listOfNumbers);
		//------------Using method reference---------------
		System.out.println("Using method reference");
		listOfNumbers.forEach(System.out::println);
		//------------Using Iterator----------------
		System.out.println("Using Iterator");
		Iterator<Integer> itr=listOfNumbers.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//---------Using Stream API-----------------------
		System.out.println("Using Stream API");
		listOfNumbers.stream().forEach(System.out::println);
		//---------Using ListIterator------------
		System.out.println("Using ListIterator");
		ListIterator<Integer> listItr=listOfNumbers.listIterator();
		listItr.forEachRemaining(System.out::println);
		//--------splitIterator---------------------------
		System.out.println("splitIterator");
		Spliterator<Integer> spit=listOfNumbers.spliterator();
		spit.forEachRemaining(System.out::println);
		//----------Using parallel Stream------------------------
		System.out.println("Using parallel Stream");
		listOfNumbers.parallelStream().forEach(System.out::println);
		}
}
