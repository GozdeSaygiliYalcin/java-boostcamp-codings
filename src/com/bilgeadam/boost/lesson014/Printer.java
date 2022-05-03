package com.bilgeadam.boost.lesson014;

public class Printer {
	private static final double CRITICAL_TONER_LEVEL = 0.10d;
	private static final double TONER_USAGE_PER_SHEET = 0.01d;
	
	private String printerName; //the name of the printer
	private double tonerLevel; //The information about the toner level
	private int printedBwpages; //The information about how many black-white pages are printed.
	private int printedColPages;//The information about how many colorful pages are printed.
	private boolean twoSidedCapable; //Can printer do two sided printing?
	private boolean colorCapable; //Can printer do colorful printing?
	private int numPapers; //Is there enough paper in order to print?
	
	public Printer() { // a new printer is defined
		this.tonerLevel = 100.0; //Initial toner level
		this.printedBwpages =0;
		this.printedColPages=0;
		this.numPapers = 0;
	}
	public void startPrintJob(int numPages, boolean colorful, boolean twoSided) {
			if(!isTonerLevelSufficient()) {
				this.fillTonerLevel(100.0);
			}
			int printedSheets =1;
			while(printedSheets <= numPages) {
				if(isPaperaAvailable()) {
					System.err.println("There is not sufficient toner. It has to be filled.");
					this.fillPaper(50);
		
			}
			boolean colorPrint;
			printedSheets = PrintPage(printedSheets, colorPrint, twoSided);
			
			{
	    	this.endPrintJob();
	    	
	    }	
	    private int PrintPage(int sheetNumber, boolean colorPrint, boolean twoSided) {
		sheetNumber++;
		System.out.println(sheetNumber + "  sheets are printed");
		this.tonerLevel = this.tonerLevel - this.tonerLevel*Printer.TONER_USAGE_PER_SHEET;
		return sheetNumber;
		
	    }
		private boolean isPaperaAvailable() {
		return false;
		
	    }
		private void endPrintJob() {
	    	System.out.println("Successfully printed");
	    
	    }
	    private boolean isTonerLevelSufficient() {
			return this.tonerLevel >=Printer.CRITICAL_TONER_LEVEL;
		
	    }
		public void setPrinterName(String printerName) {
			this.printerName = printerName;
		}
		public void fillTonerLevel(double tonerLevel) {
			this.tonerLevel = tonerLevel; 
		}
		public void setPrintedBwpages(int printedBwpages) {
			this.printedBwpages = printedBwpages;
		}
		public void setPrintedColPages(int printedColPages) {
			this.printedColPages = printedColPages;
		}
		public void setTwoSidedCapable(boolean twoSidedCapable) {
			this.twoSidedCapable = twoSidedCapable;
		}
		public void setColorCapable(boolean colorCapable) {
			this.colorCapable = colorCapable;
		}
		public void fillPaper(int paperAmount) {
			this.numPapers = paperAmount;
	}

	public void statusReport() {
		System.out.println("Printer name is: " + this.printerName);
		int totalPages = printedBwpages + printedColPages;
		System.out.println("Total page is: " + totalPages);
		if (totalPages > 0);
		System.out.println(printedBwpages + (printedBwpages/totalPages) + "%");
		System.out.println(printedColPages + (printedColPages/totalPages) + "%");
	}
	@Override
	public String toString() {
		return "Printer [printerName=" + printerName + ", tonerLevel=" + tonerLevel + ", printedBwpages="
				+ printedBwpages + ", printedColPages=" + printedColPages + ", twoSidedCapable=" + twoSidedCapable
				+ ", colorCapable=" + colorCapable + ", numPapers=" + numPapers + "]";
	}


	public boolean isTwoSidedCapable() {
		return twoSidedCapable;
	}


	public boolean isColorCapable() {
		return colorCapable;
	}
	
	
}
