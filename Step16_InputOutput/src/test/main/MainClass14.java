package test.main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		/*
		 *  MemberDto 객체를 파일에 저장할수도 있을까?
		 *  파일에 저장했다면 저장된 MemberDto 객체를 다시 불러올수도 있을까?
		 */
		MemberDto dto=new MemberDto(1, "김구라", "노량진");
		
		//필요한 객체의 참조값을 담을 지역 변수를 미리 만들기
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			fos=new FileOutputStream("C:/Users/user/playground/myFolder/member.dat");
			//FileOutputStream 객체를 생성자의 매개변수로 전달하면서 ObjectOutputStream 객체를 생성한다.
			oos=new ObjectOutputStream(fos);
			//객체를 저장하는 메소드를 호출하면서 MemberDto 객체 전달하기 
			oos.writeObject(dto);
			System.out.println("파일에 객체를 저장했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(oos!=null)oos.close();
				if(fos!=null)fos.close();
			}catch(Exception e) {}
		}
	}
}











