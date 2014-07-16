package com.crack.code.eamples;

public class UniqueCharacters {

	/**Implement an algorithm to determine if a string has all unique characters.
	 * What if you can not use additional data structures?
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[] char_set = new boolean[256]; // index 0-255 decimal values, total 256 ASCII character
		 String str = "abc";
		 
		 for (int i= 0; i < str.length(); i++) {
			int val = str.charAt(i); // getting decimal value of char
			System.out.println(val);
			 if (char_set[val]) { // Already found this char in string
				 System.out.println("found");
			}
			 char_set[val] = true;

	    }
	}

}
