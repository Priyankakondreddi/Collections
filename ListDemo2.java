/*
 * Store 10 city names in a List<String>.

Find the city with the longest name.

Print the length of each city name.
 */

package com.java.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListDemo2 {

	public static void main(String[] args) {
		
		List<String> listOfCities=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter city names");
		for(int i=0;i<10;i++)
		{
			listOfCities.add(sc.nextLine());
		}
	}

}
