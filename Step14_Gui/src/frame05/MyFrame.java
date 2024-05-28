package frame05;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

//어디에선가 이 클래스로 객체를 생성하면 프레임 하나가 화면상에 나타난다 
public class MyFrame extends JFrame implements ActionListener{
	//필드
	JButton saveBtn, updateBtn, deleteBtn;
	
	
	//생성자
	public MyFrame() {
		//프레임의 제목 설정
		this.setTitle("나의 프레임");
		//프레임의 위치와 크기 설정 setBounds(x, y, width, height)
		setBounds(100, 100, 500, 500);
		//종료 버튼을 눌렀을때 프로세스 전체가 종료 되도록 한다 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 레이아웃 메니저 객체 생성 
		FlowLayout layout=new FlowLayout(FlowLayout.LEFT);
		
		//프레임의 레이아웃 메니저 설정
		setLayout(layout);
		
		//JButton 객체 생성해서 참조값을 필드에 저장해 둔다(다른 메소드에서 사용가능하게 하려고) 
		this.saveBtn=new JButton("저장");
		updateBtn=new JButton("수정");
		deleteBtn=new JButton("삭제");
		
		add(saveBtn);
		add(updateBtn);
		add(deleteBtn);
		
		//액션 리스너 등록
		saveBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		
		//화면상에 실제 보이도록 한다. 
		setVisible(true); 
	}
	
	//main 메소드
	public static void main(String[] args) {
		new MyFrame();
	}
	// implements ActionListener 했기 때문에 강제로 구현된 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("저장, 수정, 삭제 버튼중에 하나가 눌러졌군요!");
		//눌러진 버튼의 참조값 얻어내기
		Object which = e.getSource();
		
		if(which == this.saveBtn) {
			System.out.println("저장 합니다");
		}else if(which == updateBtn) {
			System.out.println("수정 합니다");
		}else if(which == deleteBtn) {
			System.out.println("삭제 합니다");
		}
	}
	
}



















