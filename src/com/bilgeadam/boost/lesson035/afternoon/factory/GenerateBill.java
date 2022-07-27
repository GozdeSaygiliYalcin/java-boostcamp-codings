package com.bilgeadam.boost.lesson035.afternoon.factory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

	public static void main(String[] args) throws IOException {
		
		PlanFactory planFac = new PlanFactory();
		System.out.println("Enter rhe name of plan: ");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		String planName = br.readLine();
		System.out.println("Enter the number of units: ");
		int units = Integer.parseInt(br.readLine());
		
		Plan p = planFac.getPlan(planName);
		
		System.out.println("Bill amount for " + planName + " of " +units + " units are: " );
		p.getRate();
		p.calculateBill(units);
		
	}

}
