package pack03;

import javax.swing.JOptionPane;

public class AccountView {

	public static void main(String[] args) {
		// 입력 화면
		String name = JOptionPane.showInputDialog("이름 입력");
		String title = JOptionPane.showInputDialog("계좌이름 입력");
		int price = Integer.parseInt(JOptionPane.showInputDialog("금액 입력"));
		
		// 제어부분(control)
		// 가방을 만들어서 입력 데이터를 가방에 넣어주자.
		AccountVO account = new AccountVO();
		account.setName(name);
		account.setTitle(title);
		account.setPrice(price);
		
		// DB에 넣는 처리 - DAO에게 가방에 넣어서 전달
		AccountDAO dao = new AccountDAO();
		dao.create(account);
	}

}
