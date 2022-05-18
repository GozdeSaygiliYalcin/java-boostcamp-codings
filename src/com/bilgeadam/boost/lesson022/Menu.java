package com.bilgeadam.boost.lesson022;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Menu {
	
	public static int randomlyPick(int number) {
		Random random =new Random();
		int randomChoice = random.nextInt(number);
		return randomChoice;
		
	}

	public static String days() {
		
		String [] day = new String[7];
		
		day[0] = "Monday";
		day[1] = "Tuesday";
		day[2] = "Wednesday";
		day[3] = "Thursday";
		day[4] = "Friday";
		day[5] = "Saturday";
		day[6] = "Sunday";
		
		return day[randomlyPick(6)];
	}
	
	public static List<String> mainCourses() {
		
		List<String> mainCourseList =new ArrayList<>();
		mainCourseList.add("chicken");
		mainCourseList.add("salad");
		mainCourseList.add("meat");
		mainCourseList.add("rice");
		mainCourseList.add("kebab");
		mainCourseList.add("meatballs");
		mainCourseList.add("beef");
		
		return mainCourseList;
	}

	public static String sideCourses() {
		
		List<String> sideCourseList =new ArrayList<>();
		sideCourseList.add("lentil soup");
		sideCourseList.add("chicken soup");
		sideCourseList.add("tomatoe soup");
		sideCourseList.add("rice soup");
		
		return sideCourseList.get(randomlyPick(sideCourseList.size()));
	}
	public static String randomMainCourse() {
		return mainCourses().get(randomlyPick(mainCourses().size()));
	}
	
	public static void main(String[] args) {
		System.out.println(mainCourses());
		System.out.println(sideCourses());
	}
}
