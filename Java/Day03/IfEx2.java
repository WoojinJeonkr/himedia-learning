package Third_project;
/**
* @packageName : Third_project
* @fileName : IfEx2.java
* @author : Woojin_Jeon
* @date : 2021.12.30
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.30  				 Woojin_Jeon			  최초 생성
*/
public class IfEx2 {
	/*
	Math.random
	double 형으로 0.0이상 1.0 미만 사이의 값을 반환하는 함수
	난수를 만들고 싶을때 자주 이용되는 함수
	0.xxxx ~ 0.9xxx 까지의 값을 반환
	기본형이 Double형이기에 (int) 로 정수화
	1부터의 값을 뽑고 싶다면 랜덤함수는 0부터 나오기때문에 +1을 꼭 시켜줌
	 */
	public static void main(String[] args) {
		int num = (int)(Math.random()*6)+1;

		if(num == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (num == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (num == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (num == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (num == 5) {
			System.out.println("5번이 나왔습니다.");
		} else { // else if (num == 6) {, 1이라는 숫자가 나와야만 6이라는 숫자가 나올 수 있음.
			System.out.println("6번이 나왔습니다.");
		}
	}

}