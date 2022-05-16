package com.bilgeadam.boost.lesson021;

public class SalesForEnchancedSample {
	private static final int NORTH =0;
	private static final int SOUTH =1;
	private static final int EAST =2;
	private static final int WEST =3;

	
	public static void main(String[] args) {
		// 2021 and 2022 (north, south, east, west)
		
		double sales2021North,sales2021South, sales2021East, sales2021West;
		double sales2022North,sales2022South, sales2022East, sales2022West;
		
		double [] sales =new double[8]; //first 4 items(as north, south, east, west) 20221 and 2022 equals 8 items.
		
		double[][] sales1 = new double [4][2];  //lines are area + columns are represented as year
		double[][] sales2 = new double [4][2];  //lines are year + columns are represented as area
		
		sales2[0] [NORTH] = 34;
		sales1[NORTH] [0] =25;
		
		System.out.println(sales1);
	}

}
