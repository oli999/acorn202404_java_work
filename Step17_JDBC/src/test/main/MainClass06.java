package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.util.DBConnector;

public class MainClass06 {
	public static void main(String[] args) {
		//추가할 회원의 정보라고 가정. 번호는 시퀀스로 넣기 (member_seq.NEXTVAL)
		String name="주뎅이";
		String addr="봉천동";
		
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
			pstmt.setString(1, name);
			pstmt.setString(2, addr);
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







