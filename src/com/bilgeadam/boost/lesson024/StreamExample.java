package com.bilgeadam.boost.lesson024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		String[] customerArray = {"Customer-1", "Customer-2", "Customer-3"};//first method
		List<String> customers = Arrays.asList(customerArray); 
		
		List<String> list = Arrays.asList("Customer-1", "Customer-2", "Customer-3"); //second method
		
		List<String> customerList = new ArrayList<String>(); //third method
		customerList.add("Customer-1");
		customerList.add("Customer-2");
		customerList.add("Customer-3");
		
		Stream<String> stream =list.stream();
		Stream<String> parallel =list.parallelStream();
		
		stream.forEach(s -> System.out.println("Stream: " + s + Thread.currentThread())); 
		System.out.println("=================================");
		parallel.forEach(s-> System.out.println("Parallel: " + s + Thread.currentThread()));
	}

}
