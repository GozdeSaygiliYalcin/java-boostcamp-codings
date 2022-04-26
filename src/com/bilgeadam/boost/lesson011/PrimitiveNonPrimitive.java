package com.bilgeadam.boost.lesson011;

public class PrimitiveNonPrimitive {

	public static void main(String[] args) {
		int a;
		a=10;
		
		System.out.println(a);

		int b=a;
		System.out.println(b);
		
		b=20;
		System.out.println(a);
		System.out.println(b);
		
		Person p;
		p=null;
		System.out.println(p);//null değeri atadık henüz bir nesne oluşmadı
		
		p=new Person();
		System.out.println(p);
		
		System.out.println(p.name);
		System.out.println(p.age);
		p.name ="Gözde";
		System.out.println(p.name);
	}

}
