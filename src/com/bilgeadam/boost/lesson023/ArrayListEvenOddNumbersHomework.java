package com.bilgeadam.boost.lesson023;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEvenOddNumbersHomework {
	
	static List<Integer> removeEvenNumbers(List<Integer>numbers) {
		
		List<Integer>removedNumbers = new ArrayList<Integer>();
		List<Integer>finalList = new ArrayList<Integer>();
		
		for (int i = 0; i < numbers.size(); i++) {
			if(numbers.get(i)%2 ==0 && numbers.get(i)<10) {
				removedNumbers.add(numbers.get(i));
			}
			else {
				finalList.add(numbers.get(i));
			}
		}
		return finalList;
		
	}
	public static void main(String[] args) {
		
		List<Integer> oddNumbers = new ArrayList<Integer>();
		List<Integer> evenNumbers = new ArrayList<Integer>();
		
		for(int i = 0; i<101; i++) {
			if(i%2==0) {
				evenNumbers.add(i);
			}
			else {
				oddNumbers.add(i);
			}
		}
			System.out.println(evenNumbers);
			System.out.println(oddNumbers);
			
			System.out.println(removeEvenNumbers(evenNumbers));

	}

}
