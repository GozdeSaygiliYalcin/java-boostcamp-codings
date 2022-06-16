package com.bilgeadam.boost.lesson014;



public class Printer {
	private static final double CRITICAL_TONER_LEVEL = 1d;
	private static final double TONER_USAGE_PER_SHEET = 0.5d;
	
	private String printerName; //the name of the printer
	private double tonerLevel; //The information about the toner level
	private int printedBwpages; //The information about how many black-white pages are printed.
	private int printedColPages;//The information about how many colorful pages are printed.
	private boolean twoSidedCapable; //Can printer do two sided printing?
	private boolean colorCapable; //Can printer do colorful printing?
	private int numPapers; //Is there enough paper in order to print?
	
	public Printer() { // a new printer is defined
		this.tonerLevel = 		100.0; //Initial toner level
		this.printedBwpages =	0; //when a new printer is created, the total number of B/W pages printed is 0
		this.printedColPages=	0;
		this.numPapers = 		0;
	}
	
	public void startPrintJob(int numPages, boolean colorful, boolean twoSided) {
			if(!isTonerLevelSufficient()) {
				System.err.println("There is not sufficient toner. It has to be filled.");
				this.fillTonerLevel(100.0);
			}
			int printedSheets =0; //printed sheet number
			while(printedSheets < numPages) {
				
				if(!isPaperaAvailable()) {
					System.err.println("There is not sufficient paper. It has to be added.");
					this.fillPaper(50);
				}
				printedSheets = PrintPage(printedSheets, colorful, twoSided);
			}
	    	this.endPrintJob();
	    	
	    }	
	    private int PrintPage(int sheetNumber, boolean colorPrint, boolean twoSided) {
		sheetNumber++;
		System.out.println(sheetNumber + "  sheets are printed");
		if (twoSidedCapable) {
			this.tonerLevel = this.tonerLevel - Printer.TONER_USAGE_PER_SHEET * 2;
			this.numPapers--;
		}
		else {
			this.tonerLevel  = this.tonerLevel - Printer.TONER_USAGE_PER_SHEET;
			this.numPapers  -= 2;
		}
		if (colorPrint) {
			this.printedColPages++;
		}
		else {
			this.printedBwpages++;
		}
		return sheetNumber;
	}
		private boolean isPaperaAvailable() {
		return (this.numPapers / 2) > 0; //because of the two sided printed sheets
		
	    }
		private void endPrintJob() {
	    	System.out.println("Successfully printed");
	    	this.statusReport();
	    }
	    private boolean isTonerLevelSufficient() {
			return this.tonerLevel >=Printer.CRITICAL_TONER_LEVEL;
		
	    }
		public void setPrinterName(String printerName) {
			this.printerName = printerName;
		}
		public void fillTonerLevel(double tonerLevel) {
			if (tonerLevel > 100.0) { // max %100 filling
				tonerLevel = 100.0; 
			}
			this.tonerLevel = tonerLevel;
		}
		
		public void setTwoSidedCapable(boolean twoSidedCapable) {
			this.twoSidedCapable = twoSidedCapable;
		}
		
		public void setPrintedBwpages(int printedBwpages) {
			this.printedBwpages = printedBwpages;
		}
		
		public void setPrintedColPages(int printedColPages) {
			this.printedColPages = printedColPages;
		}
	
		public void setColorCapable(boolean colorCapable) {
			this.colorCapable = colorCapable;
		}
		public void fillPaper(int paperAmount) {
			this.numPapers = paperAmount*2; //for two sided print cabability
	}

	public void statusReport() {
		System.out.println("Printer name is: " + this.printerName);
		int totalPages = printedBwpages + printedColPages;
		System.out.println("Total page is: " + totalPages);
		if (totalPages > 0);
			double printedBwRate    =  printedBwpages / (double)totalPages;
			double printedColorRate = 1 - printedBwRate;
			System.out.println("B/W printed sheet:\t" + printedBwpages + "\t (" + printedBwRate * 100 + "%)");
			System.out.println("Colorful printed sheet:\t" + printedColPages + "\t (" + printedColorRate * 100 + "%)");
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
