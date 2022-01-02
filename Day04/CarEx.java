package ex_class;
/**
* @packageName : ex_class
* @fileName : CarEx.java
* @author : Woojin_Jeon
* @date : 2021.12.31
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.31   				 Woojin_Jeon			  최초 생성
*/
public class CarEx {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		System.out.println("car1.company:"+car1.company);
		System.out.println("car1.model:"+car1.model);
		System.out.println("car1.color:"+car1.color);
		System.out.println("car1.maxspeed:"+car1.maxspeed);

		Car car2 = new Car("카니발");
		System.out.println("car2.company:"+car2.company);
		System.out.println("car2.model:"+car2.model);
		System.out.println("car2.color:"+car2.color);
		System.out.println("car2.maxspeed:"+car2.maxspeed);
		
		Car car3 = new Car("카니발", "흰색");
		System.out.println("car3.company:"+car3.company);
		System.out.println("car3.model:"+car3.model);
		System.out.println("car3.color:"+car3.color);
		System.out.println("car3.maxspeed:"+car3.maxspeed);
		
		Car car4 = new Car("카니발", "흰색", 200);
		System.out.println("car4.company:"+car4.company);
		System.out.println("car4.model:"+car4.model);
		System.out.println("car4.color:"+car4.color);
		System.out.println("car4.maxspeed:"+car4.maxspeed);
	}

}

