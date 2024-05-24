package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		//1. MemberDto 객체를 담을수 있는 ArrayList 객체를 생성해서 참조값을 members 라는 
		// 지역변수에 담아 보세요.
		List<MemberDto> members=new ArrayList<>();
		//2. 3명의 회원정보를 MemberDto 객체에 각각 담아 보세요. (MemberDto 객체가 3개 생성되어야 함)
		MemberDto dto1=new MemberDto();
		//dto1.num=1; //필드에 직접 접근 불가
		dto1.setNum(1);
		dto1.setName("김구라");
		dto1.setAddr("노량진");
		
		MemberDto dto2=new MemberDto(2, "해골", "행신동");
		MemberDto dto3=new MemberDto(3, "원숭이", "동물원");
		
		//3. 위에서 생성된 MemberDto 객체의 참조값을 ArrayList 객체에 모두 담아 보세요.
		members.add(dto1);
		members.add(dto2);
		members.add(dto3);
		
		//4. 반복문을 이용해서  members 에 들어 있는 회원정보를 출력해 보세요.
		for(MemberDto tmp:members) {
			/*
			 * String  클래스의 format() 이라는 static 메소드를 이용하면 
			 * 원하는 문자열 형식을 좀더 간편하게 얻어낼수 있다.
			 * 
			 * %d => 숫자(정수)를 출력할때
			 * %s => 문자를 출력할때
			 * %f => 실수
			 * %b => boolean
			 * %% => % 자체를 출력할때 
			 */
			String info = String.format("번호:%d  이름:%s 주소:%s ",
					tmp.getNum(), tmp.getName(), tmp.getAddr());
			System.out.println(info);
		}
		
		
		//test();
		//test("hi");
		//test("hi", "hello");
		test("hi", "hello", "bye");
		
	}
	
	//테스트용 메소드 
	public static void test(String... msg) {
		// msg 는 String[] type 이다.
		for(String tmp:msg) {
			System.out.println(tmp);
		}
	}
}








