package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass06 {
	public static void main(String[] args) {
		//문자열 안에서 역슬레시는 특별한 기호이다.
		System.out.println("main 메소드가 \"시작\" 되었습니다!");
		
		// File 객체의 메소드를 활용해서 
		// 실제 memo.txt 파일이 존재하지 않으면 파일을 만들고 
		// 존재하면 memo.txt 파일을 삭제하도록 프로그래밍해 보세요.
		//File f=new File("C:\\Users\\user\\playground\\myFolder\\memo.txt");
		
		//파일 구분자를 / 로 작성을 해도 File 객체 내부에서 알아서 처리해준다.
		File f=new File("C:/Users/user/playground/myFolder/memo.txt");
		try {
			
			if(f.exists()) {
				f.delete();
				System.out.println("삭제 했습니다.");
			}else {
				f.createNewFile();
				System.out.println("만들었습니다.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//문자열 안에서 역슬레시를 인식 시키고 싶으면 두개를 작성한다.
		System.out.println("main 메소드가 \\종료\\ 됩니다.");
	}
}




