package frame01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	//생성자
	public MyFrame(String title) {
		super(title);
		//레이아웃 설정
		setLayout(new FlowLayout(FlowLayout.CENTER));
		/*
		 *  - type 추론이 가능하다면 지역변수의 type 선언 대신에 var 로 선언 할수 있다.
		 *  - java 10  에서 추가된 문법,  아직도 실무에서는 1.8 버전을 쓰는 곳이 많기 때문에 주의!
		 *  - 지역변수에만 사용가능, 필드는 안됨
		 *  - 인터페이스 type 추론 불가 
		 *  - null 로 초기화 불가 
		 */
		var startBtn=new JButton("작업시작");
		add(startBtn);
		//리스너 등록
		startBtn.addActionListener((e)->{
			System.out.println("10 초 걸리는 작업을 시작합니다.");
			try {
				Thread.sleep(1000*10);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("작업이 종료 되었습니다.");
		});
		
		var startBtn2=new JButton("작업시작2");
		add(startBtn2);
		startBtn2.addActionListener((e)->{
			//스레드 객체를 생성해서
			WorkThread t=new WorkThread();
			//새로운 스레드를 시작 시킨다.
			t.start();
		});
	}
	
	
	// run 했을때 실행의 흐름이 시작 되는(Main Thread 가 시작되는) main 메소드
	public static void main(String[] args) {
		MyFrame f=new MyFrame("스레드 테스트 프레임");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}







