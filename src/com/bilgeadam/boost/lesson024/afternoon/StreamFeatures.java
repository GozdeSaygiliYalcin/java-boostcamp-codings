package com.bilgeadam.boost.lesson024.afternoon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamFeatures {

	public static void main(String[] args) {
		
		List<User> users = new ArrayList<User>();
		
		users.add(new User(1, "gozde"));
		users.add(new User(2, "boncuk"));
		users.add(new User(3,"efdal"));
		users.add(new User(4, "sütlaç"));
		users.add(new User(5, "ali"));
		users.add(new User(6, "veli"));
		users.add(new User(7, "49"));
		
		users.stream().forEach(user -> System.out.println(user)); //single line code
		
		users.stream().forEach(user2 -> {System.out.println("Java 8"); System.out.println(user2);});  //two lines code
		System.out.println("=====================");
		
		users.stream().forEach(user -> user.talk());
		System.out.println("=====================");

		users.stream().forEach(User::talk);
		
		long count = users.stream().filter(user -> user.id>5).count();
		System.out.println("Count: " + count);
		System.out.println("=====================");
		
		List<User> filteredList = users.stream().filter(user -> user.id > 4)
		.collect(Collectors.toList());
		
		filteredList.stream().forEach(User::talk);
		
		List<User> mappedList =	users.stream().map(user ->  new User(user.id + 100, user.name))
		.collect(Collectors.toList());
		
		mappedList.stream().forEach(user-> System.out.println(user));
		
	//	Map<Integer, String> userMap = users.stream().collect(Collectors.toMap(user -> user.id, user -> user.name));
		
		
	}

}
