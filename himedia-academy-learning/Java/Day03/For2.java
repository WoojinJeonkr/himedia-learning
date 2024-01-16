package Third_project;
/**
* @packageName : Third_project
* @fileName : For2.java
* @author : Woojin_Jeon
* @date : 2021.12.30
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.30 				 Woojin_Jeon			  최초 생성
*/
public class For2 {

	public static void main(String[] args) {
		
		// 1 ~10까지의 합 구하기
//		int sum = 0;
//		for(int i=1; i <=10; i++) {
//			sum += i;
//			System.out.println(sum);
//		
//		}
//		System.out.println("1~10의 합:"+sum);
		
		// 1 ~ 10까지의 정수 중 짝수 구하기
//		System.out.println("1~10까지의 정수 중 짝수");
//		for(int i=1; i <=10; i++) {
//			if(i%2 == 0) { // i를 2로 나눴을 경우 나머지가 0과 같다면
//				System.out.println(i);
//			}
//		}
//		
//		// 1 ~ 10까지의 정수 중 홀수 구하기
//		System.out.println("1~10까지의 정수 중 홀수");
//		for(int i=1; i <=10; i++) {
//			if(i%2 == 1) { // i를 2로 나눴을 경우 나머지가 1과 같다면
//				System.out.println(i);
//			}
//		}
//		
		// 1 ~ 10까지의 정수 중 3의 배수 구하기
//		System.out.println("1~10까지의 정수 중 3의 배수");
//		for(int i=1; i <=10; i++) {
//			if(i%3 == 0) { // i를 3로 나눴을 경우 나머지가 0과 같다면
//				System.out.println(i);
//			}
//		}
		
		/*
		&와 &&의 차이
		& : 앞의 조건식이 false여도 뒤의 조건식이 true인지 false인지 판별한다.
		&& : 앞의 조건식이 false라면, 뒤의 조건식은 true인지 false인지 신경쓰지 않는다. 어차피 결과는 false이기 때문이다.
		*/
		
		// 1 ~ 100까지의 정수 중 3의 배수이면서 2의 배수인 수 구하기
//		System.out.println("1~100까지의 정수 중" + " 3의 배수이면서 2의 배수인 수");
//		for(int i=1; i <=100; i++) {
//			if((i%3 == 0) && (i%2 == 0)) { // i를 3로 나눴을 경우와 2로 나눴을 경우 모두의 나머지가 0과 같다면
//				System.out.println(i);
//			}
//		}
		
		System.out.println("1~100까지의 정수 중" + " 조건에 만족하는 수");
		for(int i=1; i <=100; i++) {
			if(i%3 == 0 || i%2 == 0 && i%5 == 0) {
				System.out.println(i);
			}
		}
	}

}
