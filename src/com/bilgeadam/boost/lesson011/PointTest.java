package com.bilgeadam.boost.lesson011;

public class PointTest {

	public static void main(String[] args) {
		Point p = new Point();
		p.x =10.3d;
		p.y =26.8d;
		
		Point q;
		q=p;
		
		System.out.println("P'nin x değeri :"+ p.x + "\tP'nin y değeri :"+p.y);
		System.out.println("Q'nin x değeri :"+ q.x + "\tQ'nin y değeri :"+q.y);
		
		System.out.println("---------------");
		p.x =15.9;
		System.out.println("P'nin x değeri :"+ p.x + "\tP'nin y değeri :"+p.y);
		System.out.println("Q'nin x değeri :"+ q.x + "\tQ'nin y değeri :"+q.y);
		
		System.out.println("---------------");
		q.x =100;
		System.out.println("P'nin x değeri :"+ p.x + "\tP'nin y değeri :"+p.y);
		System.out.println("Q'nin x değeri :"+ q.x + "\tQ'nin y değeri :"+q.y);
	}

}
