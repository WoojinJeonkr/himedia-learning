package Fourth_project;
/**
 * 
* @packageName : Fourth_project
* @fileName : AdvanceFor.java
* @author : Woojin_Jeon
* @date : 2021.12.31
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.31   				 Woojin_Jeon			  최초 생성
 */
public class AdvanceFor {

	public static void main(String[] args) {
		int[] scores = {50, 65, 10, 34};
		
		// 배열의 합 구하기
		int sum = 0;
		for(int score : scores) {
			sum = sum+score;
		}
		System.out.println("점수합:"+sum);
		
		// 배열의 평균 구하기
		double avg = (double)sum/scores.length;
		System.out.println("점수 평균:"+avg);
	}

}

