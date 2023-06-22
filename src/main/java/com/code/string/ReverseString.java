package com.code.string;

public class ReverseString {

	public static void main(String[] args){
			// String name = "Monika";
			// int len = name.length();
			// String reversedString = "";

			// for(int i = len-1; i>=0; i--){
			// 	reversedString = reversedString+ name.charAt(i);
			// }
			// System.out.println("Reversed string :"+reversedString);
			String reversedStr = ReverseString.getReverseString("Dheeraj");
			System.out.println(reversedStr);

	}

	public static String getReverseString(String name){

		int len = name.length();
		String reversedString ="";
		
		for(int i=len-1; i>=0; i--){
		reversedString += name.charAt(i);
		}

		return reversedString;

	}


}

	

