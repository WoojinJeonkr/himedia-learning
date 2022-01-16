package Second_project;

import java.util.Scanner;
/**
* @packageName : Second_project
* @fileName : ScannerEx2.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class ScannerEx2 {

	public static void main(String[] args) {
		/*
		Scanner scanner = new Scanner(System.in);
		int x;
		int y;
		
		System.out.print("첫번째 숫자: ");
		x = scanner.nextInt();
		System.out.print("두번째 숫자: ");
		y = scanner.nextInt();
		System.out.printf("두 숫자의 합은 %d이다.", x+y);
		 */
		Scanner scanner = new Scanner(System.in);
		String inputData1;
		String inputData2;

		inputData1 = scanner.nextLine();
		inputData2 = scanner.nextLine();
		
		System.out.print("두 숫자의 합:" + (Integer.parseInt(inputData1) + Integer.parseInt(inputData2)));
		
	}
	
}
