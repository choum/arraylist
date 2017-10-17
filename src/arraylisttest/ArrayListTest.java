/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttest;

import java.util.*;
public class ArrayListTest 
{
	public static void main(String args[]) 
       {
		ArrayList <Integer> al = new ArrayList ();
		al.add(1);
		al.add(2);
		Integer three = new Integer(3);
		al.add(three);
		System.out.println("The capacity of al is " + al.size());
		System.out.println("al now contains " + al);
		
                    if (al.contains(three)) {
			System.out.println("al contains three");
			System.out.println("three is at index " + al.indexOf(three));
		}
		al.add(0, new Integer(4));
		System.out.println("The capacity of al is now " + al.size());
		System.out.println("al now contains " + al);
		al.remove(1);
		System.out.println("The capacity of al is now " + al.size());
		System.out.println("al now contains " + al);
		al.set(0, three);
		System.out.println("al now contains " + al);
		System.out.println(al);
		for (Integer i : al)
			System.out.println(i.toString());
	}
}
