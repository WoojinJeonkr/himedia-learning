package Third_project;
/**
* @packageName : Third_project
* @fileName : While2.java
* @author : Woojin_Jeon
* @date : 2021.12.30 
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.30  				 Woojin_Jeon			  최초 생성
*/
import java.util.Scanner; 
//public class While2 {
	
// public static void main(String[] args) {
	
	// 1~100의 합 구하기 1
//	int sum = 0;
//	int i = 1;
//	
//	while(i<=100) {
//		sum += i;
//		i++;
//	}
//	System.out.println("1~"+(i-1)+" 합:"+sum);

	// 1~100의 합 구하기 2
//	int sum = 0;
//	int i = 0;
//	
//	while(i<100) {
//		i++;
//		sum += i;
//	}
//	System.out.println("1~"+(i)+" 합:"+sum);
	
	// 1~100의 합 구하기 3
//	int sum = 0;
//	int i = 1;
//		
//	while(i<=100) {
//		sum += i;
//		if(i == 100){
//			break;
//		}
//		i++;
//	}
//	System.out.println("1~"+(i-1)+" 합:"+sum);
		
	// 1~100까지의 합 구하기 4
//	int sum = 0;
//	int init = 1;
//	int i = init;
//	int end = 100;
//		
//	while(i<=end) {
//		sum += i;
//		if(i == end) {
//			break;
//		}
//		i++;
//	}
//	System.out.println("1~"+(i)+" 합:"+sum);

// 초기값과 끝값을 입력 받아 입력 받은 정수 범위의 합 구하기
//import java.util.Scanner; 
//
//public class While2 {
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//			int sum = 0;
//			// int init = Integer.parseInt(scanner.nextLine());
//			int init = scanner.nextInt();
//			int i = init;
//			// int end = Integer.parseInt(scanner.nextLine());
//			int end = scanner.nextInt();
//			
//			while(i<=end) {
//				sum += i;
//				if(i == end) {
//					break;
//				}
//				i++;
//			}
//			System.out.println(init+"~"+end+" 합:"+sum);
//			scanner.close();
//	}
//}

// 초기값과 끝값을 입력 받아 입력 받은 정수 범위의 합 구하기 (계속 입력 가능)
public class While2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			int sum = 0;
			// int init = Integer.parseInt(scanner.nextLine());
			int init = scanner.nextInt();
			int i = init;
			// int end = Integer.parseInt(scanner.nextLine());
			int end = scanner.nextInt();
			
			while(i<=end) {
				sum += i;
				if(i == end) {
					break;
				}
				i++;
			}
			System.out.println(init+"~"+end+" 합:"+sum);
			// scanner.close();
		}
	}
}

