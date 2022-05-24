package com.bilgeadam.boost.lesson024;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperationExample {

	public static void main(String[] args) {
		
		Integer [] ints = {1,2,3,4,5,6,7,8,9,10};
		
		List<Integer> list = Arrays.asList(ints);
		
		Stream<Integer> intStream = Arrays.asList(ints).stream();
	//	intStream.forEach(s-> System.out.println("Stream: " + s));
		
		intStream = intStream.map(x-> x*x).filter(x -> x>9);
		intStream.forEach(s-> System.out.println("Stream: " + s));
;		
	}

}
