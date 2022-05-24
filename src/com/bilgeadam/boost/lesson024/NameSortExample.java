package com.bilgeadam.boost.lesson024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameSortExample {
	
	
	
	public static void main(String[] args) {
		
		String[] names = {"ali", "velilerce", "gozde", "efdalcik", "boncuklar"};
		
	
		
		System.out.println(Arrays.toString(names));
		Arrays.sort(names, new StringLengthComparator());
		
		Arrays.sort(names, StringLengthComparator.COMPARATOR);
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, StringLengthComparator.DSC);
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names, StringLengthComparator.ASC);
		System.out.println(Arrays.toString(names));
	}

}
