package Fourth_project;

import java.time.LocalDate;
import java.time.LocalTime;
/**
* @packageName : Fourth_project
* @fileName : Date.java
* @author : Woojin_Jeon
* @date : 2021.12.31
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.31   				 Woojin_Jeon			  최초 생성
*/
public class Date {

	public static void main(String[] args) {
		
		// 오늘 날짜
		LocalDate localdate = LocalDate.now();
		System.out.println("년:"+localdate.getYear());
		// System.out.println("월:"+localdate.getMonth());
		System.out.println("월:"+localdate.getMonthValue());
		System.out.println("일:"+localdate.getDayOfMonth());
		System.out.println("요일:"+localdate.getDayOfWeek());
		
		// 날짜 지정
		LocalDate localdate2 = LocalDate.of(2022, 1, 24);
		System.out.println("년:"+localdate2.getYear());
		// System.out.println("월:"+localdate2.getMonth());
		System.out.println("월:"+localdate2.getMonthValue());
		System.out.println("일:"+localdate2.getDayOfMonth());
		System.out.println("요일:"+localdate2.getDayOfWeek());
		
		// 현재 시간
		LocalTime time = LocalTime.now();
		System.out.println(time.getHour()+"시");
		System.out.println(time.getMinute()+"분");
		System.out.println(time.getSecond()+"초");
	}

}
