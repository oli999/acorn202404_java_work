package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnector;

public class MainClass07 {
	
	public static void main(String[] args) {
		//추가할 회원의 정보라고 가정. 번호는 시퀀스로 넣기 (member_seq.NEXTVAL)
		String name="덩어리";
		String addr="상도동";
		
		//추가할 회원의 정보를 MemberDto 객체에 담는다.
		MemberDto dto=new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		//insert() 메소드를 호출하면서 MemberDto 객체의 참조값을 전달한다.
		insert(dto);
	}
	
	//회원정보를 DB 에 저장해주는 static 메소드
	public static void insert(MemberDto dto) {
		//dto 에 추가할 회원의 이름과 주소가 들어 있다는 가정하에서 메소드를 완성해 보세요. 
		//sql 문을 대신 실행해줄 객체의 참조값을 담을 지역변수 미리 만들기
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			//미리 준비한 유틸 클래스를 이용해서 Connection 객체 얻어오기
			conn=new DBConnector().getConn();
			//실행할 미완성의 sql 문
			String sql="INSERT INTO member"
					+ " (num, name, addr)"
					+ " VALUES(member_seq.NEXTVAL, ?, ?)";
			//미완성의 sql 문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt=conn.prepareStatement(sql);
			//PreparedStatement 객체의 메소드를 이용해서 미완성인 sql 문을 완성시키기(? 에 값 바인딩하기)
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			//sql 문 실행하기
			pstmt.executeUpdate();
			System.out.println("회원 정보를 추가했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null)pstmt.close();
				if(conn!=null)conn.close();
			}catch(Exception e) {}
		}
	}
	
}







