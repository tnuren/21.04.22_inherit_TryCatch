package day18.pkg;

public class TryCatch_01 {

	public static void main(String[] args) {
		/*
		 * 예외(Exception) 처리
		 * try {
		 *  실행할 내용
		 * 
		 * } catch(익셉션이름 e){
		 *  해당 예외(익셉션)가 발생할 경우 실행할 내용
		 * }
		 * 
		 */
		
		try {
			int[] num = new int[3];
		// index 는 2까지
			num[2] = 10;
		
			System.out.println("try 마지막줄");
			
		
		} catch (Exception e) {
			System.out.println("배열크기 초과.");
//			ArrayIndexOutOfBoundsException e => 구체적인 익셉션
			e.printStackTrace(); // => 익셉션의 구체적인 내용을 보여주는 프린트물
		} finally {
			//finally => 옵션이다. 안써도된다
			System.out.println("예외가 나든 안나든 무조건 여기는 나옵니다.");
		}
		
		
		System.out.println("try catch 끝나고"); // try catch 없으면 프린트물이 안나옴.
		
		
		
		
		
		
	}

}
