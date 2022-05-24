package com.bilgeadam.boost.lesson024;

import java.util.Comparator;

public class StringLengthComparator implements Comparator<String> {
	
	public static final boolean ASCENDING = true;
	public static final boolean DESCENDING= false;
	
	public static final StringLengthComparator COMPARATOR = new StringLengthComparator();
	public static final StringLengthComparator ASC = new StringLengthComparator(ASCENDING);
	public static final StringLengthComparator DSC = new StringLengthComparator(DESCENDING);
	
	private boolean ascending;
	
	public StringLengthComparator() {
		this.ascending = ASCENDING;
	}
	public StringLengthComparator(Boolean ascending) {
		this.ascending = ascending;
	}

	@Override
	public int compare(String o1, String o2) {
		int result = 0;
		if(o1.length()<o2.length()) 
			result= -1;
			
		if (o1.length()> o2.length()) 
			result =1;
		
		return this.ascending ? result : -result;
		
	

	}
}
