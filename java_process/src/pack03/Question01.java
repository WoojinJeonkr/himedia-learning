package pack03;

import javax.swing.JOptionPane;
/**
  * @FileName : Question01.java
  * @Project : test01
  * @Date : 2022. 2. 12. 
  * @작성자 : WoojinJeonkr
  * @변경이력 :
  * @프로그램 : 두 수를 입력받아서 동일하면 동일해요! 동일하지 않으면 달라요! 출력
 */
public class Question01 {

	public static void main(String[] args) {
		// 두 수를 입력받음
		String no1 = JOptionPane.showInputDialog("첫번째 수를 입력해주세요.");
		String no2 = JOptionPane.showInputDialog("두번째 수를 입력해주세요.");
		
		// String --> int로 변환
		int num1 = Integer.parseInt(no1);
		int num2 = Integer.parseInt(no2);
		
		// 두 수 비교
		// 기본 데이터인 경우, 비교 연산자를 써서 비교 가능
		if(num1 == num2) {
			JOptionPane.showMessageDialog(null, "동일해요!");
		} else {
			JOptionPane.showMessageDialog(null, "달라요!");
		}
	}
}
