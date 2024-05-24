package test.mypac;

public class Rect {
	//가로 세로의 길이를 저장할 필드 
	public int width;
	public int height;
	
	public void showArea() {
		//1. 넓이를 구해서
		int area = this.width * this.height;
		//2. 콘솔창에 출력한다.
		System.out.println("넓이:"+area);
	}
}
