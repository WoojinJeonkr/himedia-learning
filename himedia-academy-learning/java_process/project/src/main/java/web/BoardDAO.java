package web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;

public class BoardDAO {
	// DAO: Data Access Object
	// CRUD
	// 게시판 생성(Create)
	public void create(BoardVO vo) throws Exception {
		System.out.println("dao에서 전달받은 값: "+vo);
		String idx2 = vo.getIdx();
		String title2 = vo.getTitle();
		String name2 = vo.getName();
		String text2 = vo.getText();
		String id = vo.getId();
		System.out.println("전달받은 번호는 "+idx2);
		System.out.println("전달받은 제목은 "+title2);
		System.out.println("전달받은 작성자는 "+name2);
		System.out.println("전달받은 내용은 "+text2);
		System.out.println("게시판 생성 처리 요청됨.");
		
		// db프로그램 순서
		// 1. connector라이브러리 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버/커넥터 설정 성공");
		
		// 2. db 연결 : 1) ip+port, 2) user+pw, 3)db명(big)
		String url="jdbc:mysql://localhost:3306/big?useUnicode=true&characterEncoding=utf8";
		String user="root";
		String pass = "1234";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		System.out.println("2. db 연결 성공");
		
		// 3. sql문을 생성
		String sql = "insert into Board values(?, ?, ?, ?, now())";
		
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL 객체 생성 성공.");
		ps.setString(1, idx2);
		ps.setString(2, title2);
		ps.setString(3, name2);
		ps.setString(4, text2);
		
		// 4. 생성한 sql문을 mysql로 보낸다
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.");
	}
	
//	public boolean login(BoardVO vo) throws Exception {
//		System.out.println("회원 로그인 처리 요청됨.");
//		System.out.println("dao에서 전달받은 값:" + vo);
//		String id2 = vo.getId();
//		
//		//db프로그램 순서
//		//1. connector라이브러리 설정
//		Class.forName("com.mysql.jdbc.Driver");
//		System.out.println("1. 드라이버/커넥터 설정 성공");
//		
//		//2. db 연결 : 1) ip+port, 2) user+pw, 3)db명(big)
//		String url = "jdbc:mysql://localhost:3306/big";
//		String user = "root";
//		String pass = "1234";
//		
//		Connection con = DriverManager.getConnection(url, user, pass);
//		
//		System.out.println("2. db연결 성공");
//		
//		//3. sql문을 생성
//		String sql = "select * from board where id = ?";
//
//		PreparedStatement ps = con.prepareStatement(sql);
//		System.out.println("3. SQL객체 생성 성공.");
//		ps.setString(1, id2);
//		
//		//4. 생성한 sql문을 mysql로 보낸다.
//		ResultSet rs = ps.executeQuery();
//		//System.out.println("결과값 있는지 체크 결과는 >>" + rs.next());
//		System.out.println("4. SQL문 전송 성공.");
//		boolean result = false; // 없음
//		if(rs.next()) {
//			System.out.println("검색 결과가 있습니다.");
//			result = true;
//		}else {
//			System.out.println("검색 결과가 없습니다.");
//		}
//		return true;
//	}
	
	// 단일 검색
		public BoardVO readOne(BoardVO vo) throws Exception {
			System.out.println("회원정보 검색 처리 요청됨.");
			System.out.println("dao에서 전달받은 값: " + vo);
			String idx2 = vo.getIdx();

			System.out.println("전달받은 번호는 " + idx2);
			System.out.println("회원정보 검색 처리 요청됨.");

			// db프로그램 순서
			// 1. connector 라이브러리 설정
			Class.forName("com.mysql.jdbc.Driver");

			System.out.println("1. 드라이버/커넥터 설정 성공");

			// 2. db 연결 : 1) ip+port, 2) user+pw, 3) db명(big)
			String url = "jdbc:mysql://localhost:3306/big";
			String user = "root";
			String pass = "1234";

			Connection con = DriverManager.getConnection(url, user, pass);

			System.out.println("2. db 연결 성공");

			// 3. sql문을 생성
			String sql = "select * from board where idx = ?";

			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL 객체 생성 성공.");
			ps.setString(1, idx2);

			// 4. 생성한 sql문을 mysql로 보낸다.
			ResultSet rs = ps.executeQuery();
			// System.out.println("결과값 있는지 체크 결과는 "+rs.next());
			System.out.println("4. SQL문 전송 성공");
			BoardVO vo2 = new BoardVO();
			if (rs.next()) {
				String idx = rs.getString("idx");
				String title = rs.getString("title");
				String name = rs.getString("name");
				String text = rs.getString("text");
				Timestamp rgstdate = rs.getTimestamp("rgstdate");
				vo2.setIdx(idx); 
				vo2.setTitle(title);
				vo2.setName(name);
				vo2.setText(text);
				vo2.setRgstdate(rgstdate);
				
			} else {
				System.out.println("검색 결과 없음.");
			}
			return vo2;
		}
		
		// 다중 검색
		public ArrayList<BoardVO> readAll() throws Exception {
			System.out.println("회원전체 목록 검색 처리 요청됨.");

			// db프로그램 순서
			// 1. connector라이브러리 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 드라이버/커넥터 설정 성공");

			// 2. db 연결 : 1) ip+port, 2) user+pw, 3)db명(big)
			String url = "jdbc:mysql://localhost:3306/big";
			String user = "root";
			String pass = "1234";

			Connection con = DriverManager.getConnection(url, user, pass);

			System.out.println("2. db연결 성공");

			// 3. sql문을 생성
			String sql = "select * from board";

			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. SQL객체 생성 성공.");

			// 4. 생성한 sql문을 mysql로 보낸다.
			ResultSet rs = ps.executeQuery();
			// System.out.println("결과값 있는지 체크 결과는 >>" + rs.next());
			System.out.println("4. SQL문 전송 성공.");
			// 가방들을 모을 저장공간을 만들어야 함.
			// 배열은 적합하지 않음.
			// MemberVO[] list = new MemberVO[10]();
			// 가변적인 저장공간이 필요.
			ArrayList<BoardVO> list = new ArrayList<>();
			while (rs.next()) {
				BoardVO vo2 = new BoardVO();
				String idx = rs.getString("idx");
				String title = rs.getString("title");
				String name = rs.getString("name");
				String text = rs.getString("text");
				Timestamp rgstdate = rs.getTimestamp("rgstdate");
				vo2.setIdx(idx); 
				vo2.setTitle(title);
				vo2.setName(name);
				vo2.setText(text);
				vo2.setRgstdate(rgstdate);
				list.add(vo2);
			}
			return list;
		}
		
	// 게시판 수정(Update)
	public void update(BoardVO vo) throws Exception {
		System.out.println("게시판 수정 처리 요청됨.");
		System.out.println("dao에서 전달받은 값:" + vo);
		String idx2 = vo.getIdx();
		String text2 = vo.getText();
		
		System.out.println("전달받은 번호는 "+idx2);
		System.out.println("전달받은 내용은 "+text2);
		System.out.println("게시판 수정 처리 요청됨.");
		
		// db프로그램 순서
		// 1. connector라이브러리 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버/커넥터 설정 성공");
		
		// 2. db 연결 : 1) ip+port, 2) user+pw, 3)db명(big)
		String url="jdbc:mysql://localhost:3306/big?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String pass = "1234";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		System.out.println("2. db 연결 성공");
		
		// 3. sql문을 생성
		String sql = "update Board set text = ? where idx = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL 객체 생성 성공.");
		ps.setString(1,text2);
		ps.setString(2,idx2);

		
		// 4. 생성한 sql문을 mysql로 보낸다
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.");
	}
	// 게시판 삭제(Delete)
	public void delete(BoardVO vo) throws Exception {
		System.out.println("게시판 삭제 처리 요청됨.");
		System.out.println("dao에서 전달받은 값:" + vo);
		String idx2 = vo.getIdx();
		
		System.out.println("전달받은 번호는 "+idx2);
		System.out.println("게시판 삭제 처리 요청됨.");
		
		// db프로그램 순서
		// 1. connector라이브러리 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 드라이버/커넥터 설정 성공");
		
		// 2. db 연결 : 1) ip+port, 2) user+pw, 3) db명(big)
		String url="jdbc:mysql://localhost:3306/big?useUnicode=true&characterEncoding=utf8";
		String user = "root";
		String pass = "1234";
		
		Connection con = DriverManager.getConnection(url, user, pass);
		
		System.out.println("2. db 연결 성공");
		
		// 3. sql문을 생성
		String sql = "delete from Board where idx = ?";

		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL 객체 생성 성공.");
		ps.setString(1, idx2);

		
		// 4. 생성한 sql문을 mysql로 보낸다.
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.");
	}
}
