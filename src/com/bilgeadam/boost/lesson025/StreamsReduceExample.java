package com.bilgeadam.boost.lesson025;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsReduceExample {

	public static void main(String[] args) {
		// This is a stream reduce example
		
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(17);
		list.add(9);
		list.add(1);
		list.add(0);
		list.add(-3);
		
		Stream<Integer> stream =list.stream();
		System.out.println(stream.reduce(0, (x,y)->x+y));
		System.out.println("===========================");
		System.out.println(stream.reduce(0, (x,y)->x-y));
		System.out.println("===========================");
		
		list.stream().forEach(s-> System.out.println(s));  //1-every items will be printed
		System.out.println("===========================");
		list.stream().forEach(System.out::println); //2-double column operator. Same with number one.
		
		
		List<String> strs = new ArrayList<String>();
		strs.add("One day");
		strs.add("while i was going");
		strs.add("to school");
		System.out.println(strs.stream().reduce(" ", (x,y)->x+y));
		
	}

}
