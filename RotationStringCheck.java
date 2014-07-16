package com.crack.code.eamples;

public class RotationStringCheck {

	/**Assume you have a method isSubstring which checks if one word is a substring of another.
	 *  Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring 
	 * (i.e., “waterbottle” is a rotation of “erbottlewat”).
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String originalString = "hello";
		String rotatedString = "llohe";
		
		String concatRotatedString = rotatedString.concat(rotatedString);
		
		if(rotatedString.length() != originalString.length())
			System.out.println("String length not matches");
		
		if(concatRotatedString.contains(originalString)){
			
			System.out.println("Is a rotation of original string");
			
		}
				
				

	}

}
