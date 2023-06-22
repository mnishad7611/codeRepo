package com.code.string;

import java.util.HashMap;
import java.util.Map;

public class CharOccuranceInString {
	public static void main(String[] args){

		// String name = "payalnishad";
		// char[] arr = name.toCharArray();

		// Map<Character,Integer> map = new HashMap<>();
		

		// for(char ch : arr){
		// 	if(!map.containsKey(ch)){
		// 		map.put(ch, 1);
		// 	}else{
		// 		int value =map.get(ch);
		// 		map.put(ch,value+1);
		// 	}
		// }
		// System.out.println(map);

	Map<Character,Integer> map = CharOccuranceInString.checkMultipleCharOccurances("Monika Nishad");
	System.out.println(map);

	}

	public static Map<Character,Integer> checkMultipleCharOccurances(String name){
		char[] arr = name.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		for(char ch : arr){
			if(!map.containsKey(ch)){
				map.put(ch, 1);
			}else{
				int value =map.get(ch);
				map.put(ch,value+1);
			}
		}	 
		return map ;

	}

	
}
