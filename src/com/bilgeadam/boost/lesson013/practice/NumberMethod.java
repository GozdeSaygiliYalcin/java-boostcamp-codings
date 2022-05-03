package com.bilgeadam.boost.lesson013.practice;

public class NumberMethod {
	
	double numberOne=1.5;

	public static void main(String[] args) {
	
	double numberOne = 2.7;
	NumberMethod o1 = new NumberMethod();
	System.out.println(o1.numberMethod(numberOne));
	System.out.println(numberOne);
	System.out.println(o1.numberOne); // result is 1.5

	}
	
	double numberMethod(double numberOne) {
		//System.out.println(numberMethod(numberOne)); SORU? BUNU ÇALIŞTIRINCA BİR YERDEN SONRA EXCEPTION HATASI VERİYOR. 															METHODA METHOD MU ÇAĞIRMIŞ OLUYORUZ?
		System.out.println(this.numberOne*25); //BU SATIR NEDEN 3.SIRADA YAZDIRILIYOR? MAIN METOTA DONUP ONUNLA BİTİRMESİ 													GEREKTİĞİ İÇİN Mİ?
		System.out.println(numberOne*12);
		return numberOne;
	}
}
