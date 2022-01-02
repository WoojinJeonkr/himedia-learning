package Second_project;

import java.util.Scanner;
/**
* @packageName : Second_project
* @fileName : Ex2.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description : 3개의 숫자를 입력받고 가장 큰 숫자를 찾기
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class Ex2 {

	/*
	조건문
	작성한 코드를 조건에 따라 코드의 실행 흐름을 다르게 동작하도록 제어하는 것
	즉, 입력된 값에 따라 원하는 방향으로 동작하도록 할 수 있음
	
	if문			|  if-else 문	|  else if 문
	if(조건식){	|  if(조건식){	|  if(조건식1){
	실행문;		|  실행문;		|  실행문1;
	...			|  } else {		|  } else if(조건식2) {
	}			|  실행문;		|  실행문2;
				|  }			|  } else {
				| 				|  실행문3;
				|				|  }
				
	*/
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		/*
		int inputData1; // 변수 inputData1을 정수형으로 정의
		int inputData2; // 변수 inputData2을 정수형으로 정의
		int inputData3; // 변수 inputData3을 정수형으로 정의
		
		inputData1 = scanner.nextInt(); // 변수 inputData1을 입력받음
		inputData2 = scanner.nextInt(); // 변수 inputData2을 입력받음
		inputData3 = scanner.nextInt(); // 변수 inputData3을 입력받음
		*/
		
		int inputData1 = Integer.parseInt(scanner.nextLine()); // 변수 inputData1을 정수형으로 입력받음
		int inputData2 = Integer.parseInt(scanner.nextLine()); // 변수 inputData2을 정수형으로 입력받음
		int inputData3 = Integer.parseInt(scanner.nextLine()); // 변수 inputData3을 정수형으로 입력받음
		
		/*
		// 방법 1 - if문 연속
		if((inputData1 > inputData2) & (inputData1 > inputData3)) { 
			System.out.print("가장 큰 숫자는: "+inputData1); 
		}
		if((inputData2 > inputData3) & (inputData2 > inputData1)) { 
			System.out.print("가장 큰 숫자는: "+inputData2); 
		}
		if((inputData3 > inputData1) & (inputData3 > inputData2)) { 
			System.out.print("가장 큰 숫자는: "+inputData3); 
		}
		
		// 방법 2 - else if문 사용
		if((inputData1 > inputData2) & (inputData1 > inputData3)) {
			System.out.print("가장 큰 숫자는: "+inputData1);
		} else if((inputData2 > inputData3) & (inputData2 > inputData1)) {
			System.out.print("가장 큰 숫자는: "+inputData2);
		} if((inputData3 > inputData1) & (inputData3 > inputData2)) {
			System.out.print("가장 큰 숫자는: "+inputData3);
		}
		
		// 방법 3 - 삼항 연산자
		int result1 = inputData1 > inputData2 ? inputData1 : inputData2;
		int result2 = inputData3 > result1 ? inputData3 : result1;
		System.out.print("가장 큰 숫자는: "+result2);
		*/
		
		// 방법 4 - if-else 문
		if(inputData1 > inputData2) {
			if(inputData1 > inputData3) {
				System.out.println(inputData1);
			} else {
				System.out.println(inputData3);
			}
		} else { // inputData2가 더 큼
			if(inputData2 > inputData3) {
				System.out.println(inputData2);
			} else {
				System.out.println(inputData3);
			}
		}
	}
}
