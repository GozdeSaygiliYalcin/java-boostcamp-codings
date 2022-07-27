package com.bilgeadam.boost.lesson035.afternoon.factory;

public class PlanFactory {
	
	public Plan getPlan(String planType) {
		if(planType == null) {
			return null;
		}
		
		if(planType.equalsIgnoreCase("Domestic")) {
			return new DomesticPlan();
		}
		
		else if(planType.equalsIgnoreCase("Commercial")) {
			return new CommercialPlan();
			
		}
		
		else if(planType.equalsIgnoreCase("Instutional")) {
			return new InstutionalPlan();
		}
			return null;
	}	
}