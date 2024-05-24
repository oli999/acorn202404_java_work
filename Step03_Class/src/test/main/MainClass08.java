package test.main;

import test.mypac.Rect;

public class MainClass08 {
	public static void main(String[] args) {
		//2 개의 Rect 객체를 생성해서 
		Rect r1=new Rect();
		Rect r2=new Rect();
		
		//각각의 필드에 다른 값을 담을수도 있다. 
		r1.width=10;
		r1.height=10;
		
		r2.width=20;
		r2.height=20;
		
		//메소드를 호출해보면 각각 넓이가 다르다는 것을 알수 있다.
		r1.showArea();
		r2.showArea();
		
	}
}









