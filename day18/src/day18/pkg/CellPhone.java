package day18.pkg;

// Phone 의 자식클래스
public class CellPhone extends Phone {
	// 필드 
	String button;
	String message;
	
	// 기본생성자
	CellPhone(){
		
	}
	
	
	CellPhone(String button){
		this.button = button;
	}
	
	
	// button , model , company를 매개변수로 하는 생성자
	CellPhone(String button , String model , String company){
		this.button = button;
		this.model = model;
		this.company = company;
		
		// model , company 필드는 상속을 받아서 CellPhone이 가지고 있지 않아도 사용 가능
		
	}
	
	
	// 메소드 오버로딩 : 메소드 이름은 같지만 매개변수 타입이나 갯수가 다른 것
	
	// 메소드 
	void sendMessage(String message) {
		System.out.println("메세지 전송 " + message);
	}
	
	void sendMessage() {
		System.out.println("매개변수 없는 메소드");
	}
	
	void sendMessage(int number) {
		System.out.println("매개변수 없는 메소드");
	} // 타입이 다르면 사용가능하다. => 같은 메소드 이름이라 헷갈려서 잘안쓸거같다.
	
	
	void powerOn() {
		System.out.println("전원을 켭니다. ");
	}
	
	// 메소드 재정의(오버라이딩) : 상속받은 메소드의 내용을 수정하거나 바꾸는 것
	// 			 : 메소드 이름은 그대로 유지해야 함.
	//
	
	// @ Annotation (어노테이션) => 컴파일단계에서 우선적으로 검토됨
	
	@Override // => 재정의를 제대로 한지 안한지 체크해주는 역할
	void hangOn() {
		System.out.println("CellPhone 으로 전화를 겁니다.");
		System.out.println("CellPhone 전화");
	}
	
	
	
	
	
	
}
