package com.crack.code.eamples;

import java.util.Arrays;

public class Anagrams {

	/**Write a method to decide if two strings are anagrams or not.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abcd";
		String s2 = "bcad";
		
		char [] original = s1.toCharArray();
		char [] check = s2.toCharArray();
		
		Arrays.sort(original);
		Arrays.sort(check);
		
		String newOriginal = new String(original);
		String newCheck = new String(check);
		
		System.out.println("original "+newOriginal);
		System.out.println("check "+newCheck);
		
		if (newOriginal.equals(newCheck))
			System.out.println("Anagram");
		else
			System.out.println("NOT Anagram");

	}

}
