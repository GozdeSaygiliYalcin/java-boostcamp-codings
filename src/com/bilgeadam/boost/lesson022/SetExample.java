package com.bilgeadam.boost.lesson022;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		TreeSet trs = new TreeSet();
		trs.add("elma");
		trs.add("armut");
		trs.add("karpuz");
		for (Object object: trs) {
			String str = (String) object;
			System.out.println(str);
		}
		
		HashSet hs = new HashSet();
		hs.add("elma");
		hs.add("armut");
		hs.add("karpuz");
		hs.remove("armut");
		
		for (Object object: hs) {
			String str = (String) object;
			System.out.println(str);
	}
		int[] integers = {2,5,8,67,7687,5,8,34,98,1};
		TreeSet ts =new TreeSet(Arrays.asList(integers));
		
			for (int i : integers) {
				int num = (Integer) i;
				System.out.println(num);

				}
	}
}