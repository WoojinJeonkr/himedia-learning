package ex_class;
/**
* @packageName : ex_class
* @fileName : Car.java
* @author : Woojin_Jeon
* @date : 2021.12.31
* @description :
* ===============================================================
* DATE                         AUTHOR                  NOTE
* ---------------------------------------------------------------
* 2021.12.31   				 Woojin_Jeon			  최초 생성
*/
public class Car{
	String company = "현대자동차";
	String model;
	String color;
	int maxspeed;

	Car(){
		
	}

	Car(String model){
		this.model = model;
	}

	Car(String model, String color){
		this.model = model;
		this.color = color;
	}

	Car(String model, String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
	}
}
