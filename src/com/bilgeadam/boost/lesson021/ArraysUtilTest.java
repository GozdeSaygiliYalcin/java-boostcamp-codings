package com.bilgeadam.boost.lesson021;

import java.util.Arrays;
import java.util.Random;

public class ArraysUtilTest {

	public static void main(String[] args) {
		

		int length = 10;
		int [][]  ints = new int[length][length];
		
		Random rnd = new Random();
		
		
		for (int i=0; i<length; i++) {
			for(int j=0; j<length; j++)
			ints [i] [j] = rnd.nextInt();
		}
		System.out.println(ints);
		System.out.println(Arrays.deepToString(ints)); //birden fazla boyutlarda deeptostring 
		
		int[]array = new int[length];
		Arrays.fill(array, 5);
		System.out.println(Arrays.toString(array)); //to string tek boyutlu dizilerde rakamların görünürlüğünü sağlıyor
		
		int[] arr2 = new int[length];
		for(int i=0; i<length; i++) {
			arr2[i] = rnd.nextInt();
		}
		
		System.out.println(Arrays.toString(arr2));
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
	}

}
