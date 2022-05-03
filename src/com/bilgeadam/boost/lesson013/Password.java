package com.bilgeadam.boost.lesson013;

public class Password {
	
	private String password;
	
	public Password() { //constructor (yapıcı) method
		super();  		//hiyerarşik olarak bir üst sınıfın method ve özniteliklerine erişmek için aynı imzaya sahip yapıcı methodu çalıştırmayı sağlıyor.
		this.password = " "; //"this" bu sınıfın password isimli niteliğine erişmeyi sağlıyor
	
	}

	public boolean check (String password) {
		return password.equals(this.password); //buradaki this kelimesi yukarıdaki sınıftaki doğru passwordlari karşılaştırmayı sağlıyor.
	}
	
	public boolean assign(String oldPassword, String newPassword) {
	boolean isSuccessful = false;
	
	
		if(newPassword != null) {
			if(this.check(oldPassword) && this.checkSyntax(newPassword)) {
			isSuccessful =true;
			this.password =newPassword;
			
		}
			this.password = newPassword;
		}
			return isSuccessful;
	}
	
	private boolean checkSyntax(String password) {
		boolean isCorrect = false;
		char first = password.toLowerCase().charAt(0); //passwordu küçük harflere çevirdik (toLowercase) ve ilk karakter(charAt(0) bir değişkene atandı.
		isCorrect = (first != password.charAt(0)); // passwordun ilk karakteri ile first karşılaştırılıyor ve eğer birbirine eşitse o zaman password küçük harfle başlıyor demektir.
		return isCorrect;
	}
}
