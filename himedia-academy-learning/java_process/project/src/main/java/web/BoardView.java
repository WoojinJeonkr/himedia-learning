package web;

import javax.swing.JOptionPane;

public class BoardView {

	public static void main(String[] args) throws Exception {
		// 입력 화면(view)
		String idx = JOptionPane.showInputDialog("idx 보여주기");
		String title = JOptionPane.showInputDialog("title 보여주기");
		String name = JOptionPane.showInputDialog("name 보여주기");
		String text = JOptionPane.showInputDialog("text 보여주기");
		String rgstdate = JOptionPane.showInputDialog("rgstdate 보여주기");

		// 제어부분(control)
		// 가방을 만들어서 입력 데이터를 가방에 넣어주자.
		BoardVO bag = new BoardVO();
		bag.setIdx(idx);
		bag.setTitle(title);
		bag.setName(name);
		bag.setText(text);
		
		// DB에 넣는 처리 - DAO에게 가방에 넣어서 전달
		BoardDAO dao = new BoardDAO();
		dao.create(bag);
	}
}
