package com.hi.mvc04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDAO {
	
	public void create(BookVO vo) throws Exception {
		System.out.println("dao에서 전달받은 값:" + vo);
		String id2 = vo.getId();
		String name2 = vo.getName();
		String url2 = vo.getUrl();
		String img2 = vo.getImg();
		
		System.out.println("전달받은 번호는 " + id2);
		System.out.println("전달받은 이름은 " + name2);
		System.out.println("전달받은 주소는 " + url2);
		System.out.println("전달받은 이미지는 " + img2);
		
		System.out.println("북마크 생성 처리 요청됨.");
		
		//db프로그램 순서
		//1. connector라이브러리 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버/커넥터 설정 성공 ");
		
		//2. db 연결 : 1) ip+port, 2) user+pw, 3)db명(big)
		String url = "jdbc:mysql://localhost:3366/big";
		String user = "root";
		String pass = "1234";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		System.out.println("2. db연결 성공 ");
		
		//3. sql문을 생성
		String sql = "insert into book values (?, ?, ?, ?)";

		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL객체 생성 성공. ");
		ps.setString(1, id2);
		ps.setString(2, name2);
		ps.setString(3, url2);
		ps.setString(4, img2);
		
		//4. 생성한 sql문을 mysql로 보낸다.
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공. ");
	}
	
	public void update(BookVO vo) throws Exception {
		System.out.println("북마크 수정 처리 요청됨.");
		String name2 = vo.getName();
		String url2 = vo.getUrl();
		
		System.out.println("전달받은 이름은 " + name2);
		System.out.println("전달받은 주소는 " + url2);
		
		//db프로그램 순서
		//1. connector라이브러리 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버/커넥터 설정 성공 ");
		
		//2. db 연결 : 1) ip+port, 2) user+pw, 3)db명(big)
		String url = "jdbc:mysql://localhost:3366/big";
		String user = "root";
		String pass = "1234";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		System.out.println("2. db연결 성공 ");
		
		//3. sql문을 생성
		String sql = "update book set url = ? where name = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL객체 생성 성공. ");
		ps.setString(1,url2);
		ps.setString(2,name2);

		
		//4. 생성한 sql문을 mysql로 보낸다.
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공. ");
	}
	
	public void delete(BookVO vo) throws Exception {
		System.out.println("북마크 삭제 처리 요청됨.");
		String name2 = vo.getName();
		
		System.out.println("전달받은 이름은 " + name2);
		
		
		//db프로그램 순서
		//1. connector라이브러리 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버/커넥터 설정 성공 ");
		
		//2. db 연결 : 1) ip+port, 2) user+pw, 3)db명(big)
		String url = "jdbc:mysql://localhost:3366/big";
		String user = "root";
		String pass = "1234";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		System.out.println("2. db연결 성공 ");
		
		//3. sql문을 생성
		String sql = "delete from book where name = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL객체 생성 성공. ");
		ps.setString(1, name2);

		
		//4. 생성한 sql문을 mysql로 보낸다.
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공. ");
	}
}
