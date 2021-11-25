package com.pavan.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CollectionClass {

	public static void main(String[] args) {
		Map<String, String> dictionary=new LinkedHashMap<String, String>();
		dictionary.put("Bumfuzzle","Confusion");
		dictionary.put("Cattywampus","mismatch");
		dictionary.put("Gardyloo","warning");
		dictionary.put("Taradiddle","nonsense");
		dictionary.put("Snickersee","Dangerous knife");
		
		
		Set<String> keys=dictionary.keySet();
		System.out.println("The available words are: ");
		for(String words:keys) {
			System.out.println(words);
		}
		Scanner sc=new Scanner(System.in);
		System.out.println("Type the word you want to know about: ");
		String word=sc.next();
		System.out.println("The meaning is: "+dictionary.get(word));

	}

}
