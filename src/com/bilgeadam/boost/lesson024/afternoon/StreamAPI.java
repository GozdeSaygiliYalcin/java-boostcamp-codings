package com.bilgeadam.boost.lesson024.afternoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(12);
		list.add(3);
		list.add(89);
		list.add(25);
		list.add(44);
		list.add(100);
		list.add(7);
		list.add(63);
		
		list.stream().forEach(number ->System.out.println(number));  //foreach. printing all numbers
		System.out.println("==================================");
		
		List<Integer>newList = list.stream().filter(number -> number > 60).collect(Collectors.toList()); //method filter
		newList.stream().forEach(number-> System.out.println(number));
		System.out.println("==================================");
		
		List<Integer> recursiveList = list.stream().distinct().collect(Collectors.toList()); //method distinct
		recursiveList.stream().forEach(number -> System.out.println(number));
		System.out.println("==================================");
		
		list.stream().sorted().forEach(number-> System.out.println(number)); //method sorted
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(number ->System.out.println(number)); //method reversed order
		System.out.println("=================================="); 
		
		Collections.sort(list, (a,b) -> b.compareTo(a)); //method sort
		System.out.println(list);
		System.out.println("==================================");
		
		List<Integer> limitList = list.stream().limit(5).collect(Collectors.toList()); //method limit
		limitList.stream().forEach(number -> System.out.println(number));
		System.out.println("==================================");
		
		List<Integer> skipList =list.stream().skip(5).limit(2).collect(Collectors.toList()); //method skip an limit
		skipList.stream().forEach(number -> System.out.println(number));
		System.out.println("==================================");
		
		long countList = list.stream().filter(number -> (number < 40)).count(); //method count
		System.out.println(countList);
		System.out.println("==================================");
		
		boolean matchList = list.stream().anyMatch(number -> number<3); //method anyMatch
		System.out.println(matchList);
		System.out.println("==================================");
		
		boolean allMatchList =list.stream().allMatch(number -> number<5); //method allMatch
		System.out.println(allMatchList);
		System.out.println("==================================");
		
		boolean noneMatchList =list.stream().noneMatch(number -> number <5); //method noneMatch
		System.out.println(noneMatchList);
		System.out.println("==================================");
		
		List<Integer> mapList = list.stream().map(number -> number*2).collect(Collectors.toList()); //method map (can be projected with any number)
			mapList.forEach(number -> System.out.println(number));
		
		
	}

}
