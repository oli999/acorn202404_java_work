package frame03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
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
		var startBtn=new JButton("카운트다운");
		add(startBtn);
		startBtn.addActionListener(this);
	}
	
	// run 했을때 실행의 흐름이 시작 되는(Main Thread 가 시작되는) main 메소드
	public static void main(String[] args) {
		MyFrame f=new MyFrame("스레드 테스트 프레임");
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// Thread 객체를 생성하면서 CountRunnable 객체의 참조값을 넘겨주고 start() 메소드를 호출한다.
		//new Thread(new CountRunnable()).start();
		
		new Thread(()->{
			//카운트 값을 저장할 지역변수 만들고 초기 값 대입
			int count=10;
			//반복문 돌면서 
			while(true) {
				System.out.println("현재 count:"+count);
				if(count==0) {//만일 카운트가 0 이면 
					break;//반복문 탈출
				}
				//1초 마다
				try {
					Thread.sleep(1000);
				} catch (Exception e2) {
					e2.printStackTrace();
				}
				//카운트를 1씩 감소 시키고 
				count--;
			}
		}).start(); 
	}
}
















