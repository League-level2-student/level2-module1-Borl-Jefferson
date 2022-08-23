package _00_intro_to_array_lists;

import java.util.ArrayList;
import java.util.Iterator;

public class IntroToArrayLists {
	public static void main(String[] args) {
		String listh;
		int i;
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> hats = new ArrayList<String>();
		ArrayList<Integer> not = new ArrayList<Integer>();
		ArrayList<String> space = new ArrayList<String>();
		//2. Add five Strings to your list
		hats.add("Baseball cap");
		hats.add("beanie");
		hats.add("fedora");
		hats.add("top hat");
		hats.add("bereau");
		for(i=0; hats.size()>i;i++) {
		space.add(String.format("%-20s", hats.get(i)));
		}
		for(i=0;i<hats.size();i++) {
			hats.set(i, space.get(i)+(i+1));
		
		}
		//3. Print all the Strings using a standard for-loop
		for( i=0; i < hats.size(); i++) {
	
			System.out.println( hats.get(i));
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for(String cycle : hats) {
			System.out.println(cycle);
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for( i=0; i < hats.size(); i++) {
			if(i%2==1) {
		
			System.out.println(	hats.get(i));
			}
		}

		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		int tally = hats.size();
		for(i=0; i < hats.size(); i++) {
			
			listh = hats.get(tally-1);
			System.out.println(listh);

			tally--;
		}
		System.out.println("\n");
		//7. Print only the Strings that have the letter 'e' in them.

		for( i=0; i < hats.size(); i++) {
			if(hats.get(i).contains("e")) {
				
				System.out.println(hats.get(i));
			}
			else{
				not.add(i);
			}
		}
System.out.print("\n");
		if(not.size()>0) {
		for(i=0; i<not.size(); i++) {
			System.out.println(hats.get(not.get(i)));
		}
		}
	}
}
