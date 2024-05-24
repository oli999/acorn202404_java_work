package test.main;

import test.mypac.MyRemocon;
import test.mypac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		// 인터페이스로 객체 생성이 가능할까?
		//Remocon r1=new Remocon(); //단독 객체 생성불가
		
		// 인터페이스가 data type 역활을 할수 있을까?
		Remocon r1 = null;
		//r1.up(); //NullPointerException 발생
		
		Remocon r2 = new MyRemocon();
		r2.up();
		r2.down();
		//Remocon 인터페이스에 정의된 static final 상수 참조  
		String result=Remocon.COMPANY; // "LG"
		
		//final 상수이기 때문에 수정 불가 
		//Remocon.COMPANY = "SAMSUNG";
		
		//final 을 안 붙이면 필요시에 값 변경 가능
		int num=10;
		num=20;
		
		//final 을 붙이면 상수화 되어서 값 변경 불가
		final int num2=10;
		//num2=20;
		
		final String NICK="김구라";
		//NICK="원숭이"; //변경 불가
		
		final Remocon r3=new MyRemocon();
		
		// r3 안에 대입된 참조값을 다른 값으로 변경 불가 
		//r3=null;
		//r3=new MyRemocon();
		
	}
}












