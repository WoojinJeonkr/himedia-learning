package ex_class;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
/**
* @packageName : ex_class
* @fileName : BoardEx.java
* @author : Woojin_Jeon
* @date : 2021.12.31
* @description : 게시판 만들기 (글이 써지는 부분) 예제
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.31   				 Woojin_Jeon			  최초 생성
*/
public class BoardEx {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2021, 4, 10);
		
		Board board = new Board();
		board.setIdx(1);
		board.setId("icarus");
		board.setName("이카루스");
		board.setTitle("애국가");
		board.setContents("동해물과 백두산이\n마르고 닳도록");
		board.setRgstdate(new Date(cal.getTimeInMillis()));
		
		Board board2 = new Board();
		board2.setIdx(2);
		board2.setId("fruit");
		board2.setName("과일");
		board2.setTitle("내가 좋아하는 과일");
		board2.setContents("사과\n배\n딸기");
		board2.setRgstdate(new Date());
		
		ArrayList list = new ArrayList();
		list.add(board);
		list.add(board2);
		
		SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy년 MM월 dd일");
		
		for(int i=0; i<list.size(); i++) {
			Board boardreturn = (Board)list.get(i);
			
			System.out.println("시퀸스: "+boardreturn.getIdx());			
			System.out.println("아이디: "+boardreturn.getId());
			System.out.println("제목: "+boardreturn.getTitle());
			System.out.println("글쓴이: "+boardreturn.getName());
			System.out.println("내용: "+boardreturn.getContents());
			System.out.println("등록일: "+simpledateformat.format(boardreturn.getRgstdate()));
			if(i<(list.size()-i)) {
			System.out.println("====================================");
			}
		}
	}
}
