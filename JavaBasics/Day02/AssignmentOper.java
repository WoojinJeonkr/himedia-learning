package Second_project;
/**
* @packageName : Second_project
* @fileName : AssignmentOper.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class AssignmentOper {

	/*
	대입 연산자
	변수에 값을 대입할 때 사용하는 이항 연산자이며, 피연산자들의 결합 방향은 오른쪽에서 왼쪽이다.
	 */
	public static void main(String[] args) {
		
		int result = 0;
		
		// result += 10;
		result = result + 10;
		System.out.println("result:"+result);
		
		// result -= 5;
		result = result - 5;
		System.out.println("result:"+result);
		
		// result *= 3;
		result = result * 3;
		System.out.println("result:"+result);
		
		// result /= 5;
		result = result / 5;
		System.out.println("result:"+result);
		
		//result %= 3;
		result = result % 3;
		System.out.println("result:"+result);
		

	}

}
