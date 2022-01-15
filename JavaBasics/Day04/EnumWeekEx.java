package Fourth_project;

import java.util.Calendar;
/**
* @packageName : Fourth_project
* @fileName : EnumWeekEx.java
* @author : Woojin_Jeon
* @date : 2021.12.31
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.31   				 Woojin_Jeon			  최초 생성
*/
public class EnumWeekEx {

	public static void main(String[] args) {
		WeekKOR today = null;
		
		//-----------
		Calendar cal = Calendar.getInstance(); // 현재 날짜 생성
		
		// 오늘이 무슨 요일인가
//		int week = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println("년: "+cal.get(Calendar.YEAR));
//		System.out.println("월: "+(cal.get(Calendar.MONTH)+1));
//		System.out.println("일: "+cal.get(Calendar.DAY_OF_MONTH));
		
		// 주어진 날짜가 무슨 요일인가
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, 0);
		cal.set(Calendar.DAY_OF_MONTH, 24);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
			case 1:
				today = WeekKOR.일요일; break;
			case 2:
				today = WeekKOR.월요일; break;
			case 3:
				today = WeekKOR.화요일; break;
			case 4:
				today = WeekKOR.수요일; break;
			case 5:
				today = WeekKOR.목요일; break;
			case 6:
				today = WeekKOR.금요일; break;
			case 7:
				today = WeekKOR.토요일; break;
		}
		System.out.println("오늘의 요일: "+today);
	}

}
