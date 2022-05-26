package com.bilgeadam.boost.lesson027.afternoon;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class DateExamples {
	static void
    findDifference(String start_date,
                   String end_date)
    {
  
        // SimpleDateFormat converts the
        // string format to date object
        SimpleDateFormat sdf
            = new SimpleDateFormat(
                "dd-MM-yyyy");
  
        // Try Block
        try {
  
            // parse method is used to parse
            // the text from a string to
            // produce the date
            Date d1 = sdf.parse(start_date);
            Date d2 = sdf.parse(end_date);
  
            // Calucalte time difference
            // in milliseconds
            long difference_In_Time
                = d2.getTime() - d1.getTime();
  
            // Calucalte time difference in
            // years,
            // and days
           
            long difference_In_Years
                = (difference_In_Time
                   / (1000l * 60 * 60 * 24 * 365));
  
            long difference_In_Days
                = (difference_In_Time
                   / (1000 * 60 * 60 * 24))
                  % 365;
  
            // Print the date difference in
            // years, in days, in hours, in
            // minutes, and in seconds
  
            System.out.print(
                "Difference "
                + "between two dates is: ");
  
            System.out.println(
                difference_In_Years
                + " years, "
                + difference_In_Days
                + " days, "
                );
        }
  
        // Catch the Exception
        catch (ParseException e) {
            e.printStackTrace();
        }
    }

	public static void main(String[] args) {
		
//		LocalDate birthDay = LocalDate.of(1989, 9, 18);
//		System.out.println(birthDay);
//		
//		LocalDate currentLocalDate = LocalDate.now();
//		System.out.println("current local date is: " + currentLocalDate);
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Please enter your birthday as dd-MM-yyyy");
//		String askBirthDay = input.next("dd-MM-yyyy");
		
		String start_date
        = "18-09-1989";

	    // Given end Date
	    String end_date
	      = "26-05-2022";
	
	    // Function Call
	    findDifference(start_date, end_date);
	    
	    String start_date2
        = "26-05-2022";

	    // Given end Date
	    String end_date2
	      = "18-09-2022";
	    
	    // Function Call
	    findDifference(start_date2, end_date2);
	    
	}

}


