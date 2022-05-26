package com.bilgeadam.boost.lesson027.afternoon;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndCalendarExample {

	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println("Today: " + today);

		Date d2702201 = new Date(117, 1, 27);
		System.out.println("27 02 2017 " +d2702201);
		
		Calendar c27022017 = new GregorianCalendar(2017,1,27);
		System.out.println("27 02 2017 "  + c27022017.getTime());
		
		DateFormat ddMMyyyy = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(ddMMyyyy.format(d2702201));
		
		DateFormat ddMMMMyyyy = new SimpleDateFormat("dd/MMMM/yyyy");
		System.out.println(ddMMMMyyyy.format(d2702201));
	}

}
