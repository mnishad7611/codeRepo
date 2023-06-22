package com.code.string;

public class PalindromeString {
	public static void main(String[] args){

		// String str = "K ee K    ";
		// str = str.replaceAll(" ","").toUpperCase();
		// System.out.println(str);

		// String revStr ="";
		// int len = str.length();

		// for(int i =len-1; i>=0; i--){
		// 	revStr = revStr+ str.charAt(i);
		// }

		// if(str.equals(revStr)){
		// 	System.out.println("Palindrome String");

		// }else{
		// 	System.out.println("Not a Palindrome String");

		// }

		boolean result = PalindromeString.checkPalindromeStr("k e e K ");

		if (result){
			System.out.println("Palindrome String");
		}else{
			System.out.println("Not a Palindrome String");
		}

	}

	public static boolean checkPalindromeStr(String str){

		str=str.replaceAll(" ","").toUpperCase();
		int len =str.length();
		String revString = "";

		for(int i=len-1; i>=0; i--){
			revString=revString+str.charAt(i);
		}
		return str.equals(revString);
	}
	
}
