package test.mypac;

public class Member {
	//필드
	public int num;
	public String name;
	public String addr;
	//생성자
	public Member() {}
	
	//생성자 int, String, String type 을 전달받는 생성자
	//필요하다면 이렇게 생성자를 다중정의(overloading) 할수도 있다. 
	public Member(int num, String name, String addr) {
		this.num=num;
		this.name=name;
		this.addr=addr;
	}
	
	//메소드
	public void printInfo() {
		System.out.println("번호:"+this.num+" 이름:"+name+" 주소:"+addr);
	}
}







