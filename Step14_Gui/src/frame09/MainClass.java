package frame09;

import javax.swing.JFrame;

public class MainClass {
	public static void main(String[] args) {
		 MyFrame f=new MyFrame("나의 프레임");
		 f.setBounds(100, 100, 500, 500);
		 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 f.setVisible(true);
	}
}


