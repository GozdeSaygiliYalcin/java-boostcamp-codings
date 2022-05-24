package com.bilgeadam.boost.lesson024.afternoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.bilgeadam.boost.lesson023.OrderNotesComparator;

public class LambdaExpressions {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("gozde", "boncukcuk", "süt", "efdal");
		System.out.println(names);
		
		Collections.sort(names, new OrderNotesComparator());
		System.out.println(names);
		
		Collections.sort(names, (String a, String b) -> {
			
			return a.compareTo(b);});
		
		System.out.println(names);
		
		Collections.sort(names, (a,b) -> b.compareTo(a));
		System.out.println(names);
		}

	}


