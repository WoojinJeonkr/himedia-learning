package Fourth_project;
/**
* @packageName : Fourth_project
* @fileName : ArrayCreate.java
* @author : Woojin_Jeon
* @date : 2021.12.31
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.31   				 Woojin_Jeon			  최초 생성
*/
public class ArrayCreate {

	public static void main(String[] args) { // 함수: 클래스 안에서 기능을 담당함, void: 리턴 값이 없음
		int sum = add(new int[] {83, 92, 50, 50, 30});
		System.out.println("총합:"+sum);
		
		int[] array = {50, 60, 70, 80, 90, 70, 80};
		System.out.println("총합:"+add(array));
	}

	public static int add(int[] scores) { // 함수: 클래스 안에서 기능을 담당함
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
