package test.main;

import test.mypac.Rect;

public class MainClass07 {
	public static void main(String[] args) {
		// Rect 클래스로 객체를 생성하고 참조값을 r1 이라는 지역변수에 담기 
		Rect r1=new Rect();
		// 가로 세로 값을 임의로 부여하고
		r1.width=10;
		r1.height=20;
		// 메소드 호출해서 테스트 해 보기 
		r1.showArea();
	}
}














