package day18.pkg;

public class Phone {
	/*
	 *  상속
	 *  : 부모클래스 , 자식클래스
	 *  : 부모가 자식한테 주는 것
	 *  : 필드 , 메소드를 준다.
	 *  private으로 선언한 필드 , 메소드는 상속 불가능
	 */
	// Phone 클래스 : 부모 클래스
	// Phone => CellPhone => SmartPhone
	// 필드
	
	String model;
	String company;
	
	// 메소드 선언
	
	void hangOn() {
		System.out.println("전화를 겁니다.");
	}
	
	void hangOff() {
		System.out.println("전화를 끊습니다.");
	}
	
	void call(String sendVoice) {
		System.out.println(sendVoice);
	}
	
	
	
	
	
	
	
	
}
