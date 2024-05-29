package test.main;

import java.io.File;
import java.io.FileWriter;

public class MainClass07 {
	public static void main(String[] args) {
		//파일에 저장할 문자열이라고 가정
		String msg = "안녕하세요!";
		// memo.txt 파일을 만들기 위한 File 객체 생성
		File f=new File("C:\\Users\\user\\playground\\myFolder\\memo.txt");
		
		try {
			//만일 memo.txt 파일이 존재하지 않으면 
			if(!f.exists()) {
				//파일 만들기 
				f.createNewFile();
				System.out.println("memo.txt 파일을 만들었습니다.");
			}
			//파일에 문자열을 출력할 객체 생성
			var fw=new FileWriter(f, true); // true => append mode (추가모드)
			fw.write(msg);
			fw.write("\r\n");//개행기호
			fw.flush(); //실제 출력
			fw.close(); //마무리
			System.out.println("memo.txt 파일에 문자열을 기록 했습니다");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}



















