package Second_project;
/**
* @packageName : Second_project
* @fileName : IncreaseDecrease.java
* @author : Woojin_Jeon
* @date : 2021.12.29
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.29   				 Woojin_Jeon			  최초 생성
*/
public class IncreaseDecrease {

	/*
	 증감 연산자
	 피연산자를 1씩 증가 혹은 감소시킬 때 사용하는 연산자.
	 피연산자가 단 하나뿐인 단항 연산자입니다.
	 해당 연산자가 피연산자의 어느 쪽에 위치하는가에 따라 연산의 순서 및 결과가 달라짐.
	 
	++x		: 먼저 피연산자의 값을 1 증가시킨 후에 해당 연산을 진행함.
	x++		: 먼저 해당 연산을 수행하고 나서, 피연산자의 값을 1 증가시킴.
	--x		: 먼저 피연산자의 값을 1 감소시킨 후에 해당 연산을 진행함.
	x--		: 먼저 해당 연산을 수행하고 나서, 피연산자의 값을 1 감소시킴.

	 */
	
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
//		System.out.println("---------------------");
//		x++; // 증가 연산자
//		++x; // 증가 연산자
//		System.out.println("x: "+x);

//		System.out.println("---------------------");
//		y--; // 감소 연산자
//		--y; // 감소 연산자
//		System.out.println("y: "+y);

//		System.out.println("---------------------");
//		z = x++;
//		System.out.println("z= "+z);
//		System.out.println("z= "+x);
		
//		System.out.println("---------------------");
//		z = ++x;
//		System.out.println("z= "+z);
//		System.out.println("z= "+x);
		
		x = x + 1;
		z = x;
		System.out.println("z= "+z);
		System.out.println("z= "+x);
	}

}

