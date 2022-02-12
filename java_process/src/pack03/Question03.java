package pack03;

import javax.swing.JOptionPane;
/**
  * @FileName : Question03.java
  * @Project : test01
  * @Date : 2022. 2. 12. 
  * @작성자 : WoojinJeonkr
  * @변경이력 :
  * @프로그램 : id가 root와 pw가 1234 모두 동일하면 로그인 성공! 동일하지 않으면 로그인 실패!
 */
public class Question03 {

	public static void main(String[] args) {
		
		// id와 비밀번호 입력받음
		String id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
		String pw = JOptionPane.showInputDialog("패스워드를 입력해주세요.");
		
		// id가 root와 pw가 1234 모두 동일한지 확인
		if(id.equals("root") && pw.equals("1234")) {
			JOptionPane.showMessageDialog(null, "로그인 성공!");
		} else {
			JOptionPane.showMessageDialog(null, "로그인 실패!");
		}
	}
}
