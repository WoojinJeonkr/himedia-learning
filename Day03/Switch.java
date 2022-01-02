package Third_project;
/**
* @packageName : Third_project
* @fileName : Switch.java
* @author : Woojin_Jeon
* @date : 2021.12.30
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.30  				 Woojin_Jeon			  최초 생성
*/
public class Switch {

	/*
	Switch/case문
	if 문과 비슷하지만 좀 더 정형화된 조건 판단문
	입력변수의 값과 일치하는 case 입력값(입력값1, 입력값2, ...)이 있다면 해당 case문에 속한 문장들이 실행
	case문마다 break 라는 문장이 있는데 해당 case문을 실행 한 뒤 switch문을 빠져나가기 위한 것
	만약 break 문이 빠져 있다면 그 다음의 case문이 실행
	입력값이 정형화되어 있는 경우 if문보다는 switch/case문을 쓰는것이 가독성에서 좀 더 유리
	switch/case문은 if else 구조로 변경이 가능하지만 if else 구조로 작성된 모든 코드를 switch 문으로 변경할 수는 없다.
	 */
	
	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;
		System.out.println("숫자는:"+num);
		
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4:
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			case 6:
				System.out.println("6번이 나왔습니다.");
				break;
			default:
				System.out.println("숫자가 안 나왔습니다.");
				break;
		} // break; 가 빠진다면 case 1 ~ default 문의 실행결과가 전부 출력된다.
		
//		 System.out.printf("%d번이 나왔습니다.", num);	 // switch/case문을 사용하지 않고 이 문구만 사용해도 출력을 할 수 있다.
	}
}


