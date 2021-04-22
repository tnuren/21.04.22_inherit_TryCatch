package day18.pkg;

public class SmartPhone extends CellPhone{
	String type = "";
	
	// 메소드 재정의
	@Override
	void powerOn() {
		System.out.println("스마트폰을 켭니다.");
	}
	
	@Override
	void hangOff() {
		System.out.println("스마트폰을 끕니다.");
	}
	
	
}
