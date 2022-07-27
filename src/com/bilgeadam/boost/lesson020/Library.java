package com.bilgeadam.boost.lesson020;


public class Library {
	
	public static void main(String[] args) {
		
			System.out.println("Hello");

			Book b1 = new Book("Kırmızı Kitap", "Orhan Pamuk", 1989);
			System.out.println(b1);
			b1.setPrice(100);
			b1.setProductsInStock(10);
			b1.sell(3, 0.20);
			b1.sell(2, 0.30);
			b1.sell(8, 0.90);
			System.out.println("Rental Price: " + b1.rentalPrice(5));
			
			Magazine m1 = new Magazine("Java World", "various", 2022, 5);
			m1.setPrice(100);
			m1.setProductsInStock(25);
			System.out.println(m1);
			m1.sell(3, 0.20);
			
//			Employee emp = new Employee("gozde", null);		// herhangi bir sınıftan public olarak tanımlanmış herhangi bir sınıfın
//			System.out.println(emp);						// bir örneğini oluşturabilir
			
//			Product p = new Product("ben neyim?");    // gerçek bir varlık olmadığı için product'ı abstract yaptık
//			System.out.println(p);	// gerçek varlıklar: book, video, ....
			
			Video v1 = new Video("Intro to java", "Babür Somer", "Türkçemsi");
			v1.setPrice(55);
			v1.setProductsInStock(5);
			System.out.println("Rental Price: " + v1.rentalPrice(5));
			System.out.println("Rental Price: " + v1.rentalPrice(6));
			
			System.out.println("Bye");
		}
	}
