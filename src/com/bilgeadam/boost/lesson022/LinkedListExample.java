package com.bilgeadam.boost.lesson022;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		linkedList.add("elma");
		linkedList.add("armut");
		linkedList.add("muz");
		linkedList.add("çilek");
		linkedList.add(1);

		linkedList.add(3, "karpuz");
		
		for(Object object:linkedList) {
			if(object instanceof String) {
			String str =(String) object;
			System.out.println(str);
			
			}
			else if(object instanceof Integer) {
			int i = (Integer)object;
			System.out.println(++i);
		}
		}
		Object[] objs = linkedList.toArray();
		System.out.println(Arrays.toString(objs));
}

}
