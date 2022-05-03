package com.bilgeadam.boost.lesson014;

import java.util.Scanner;

public class PrinterManager {
 
	private Printer printer;  //Attribute of object. Printer manager has a printer.
	
	public static void main(String[] args) {
		
			PrinterManager manager = new PrinterManager();
			manager.initPrinter();
			manager.startPrintJob();
			manager.printer.statusReport();
		
		}
		private void initPrinter() {
			
			Printer printer = new Printer();
			printer.setColorCapable(true);
			printer.setTwoSidedCapable(true);
			printer.fillPaper(10);
			printer.setPrinterName("My printer");
			printer.statusReport();
				
			System.out.println(printer);	//in order to check general values.
		
	}
		private void startPrintJob() {
			Scanner in = new Scanner(System.in);
			System.out.println("How many pages dou you want to print?");
			int numPages =in.nextInt();
			in.nextLine();
			
			boolean colorPrint = false;
			if(printer.isColorCapable())
			System.out.println("Do you want to print colorful? Y or N");
			colorPrint = in.nextLine().equalsIgnoreCase("e");
			{
			boolean twoSided = false;
			if(printer.isTwoSidedCapable())
			System.out.println("Do you want to print colorful? Y or N");
			colorPrint = in.nextLine().equalsIgnoreCase("e");
				
			System.out.println(numPages);
			}
			in.close();
			
		}
	}


