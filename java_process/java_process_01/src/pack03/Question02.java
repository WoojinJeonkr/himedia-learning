package pack03;

import javax.swing.JOptionPane;
/**
  * @FileName : Question02.java
  * @Project : test01
  * @Date : 2022. 2. 12. 
  * @작성자 : WoojinJeonkr
  * @변경이력 :
  * @프로그램 : id가 root라고 입력하면 맞아요! id가 root가 아닌 다른 것으로 입력하면 틀려요! 출력
 */
public class Question02 {

	public static void main(String[] args) {
		
		// 아이디 입력받음
		String id = JOptionPane.showInputDialog("아이디를 입력해주세요.");
		
		// id가 root와 동일한지 확인
		if(id.equals("root")) {
			JOptionPane.showMessageDialog(null, "맞아요!");
		} else {
			JOptionPane.showMessageDialog(null, "틀려요!");
		}
	}
}
