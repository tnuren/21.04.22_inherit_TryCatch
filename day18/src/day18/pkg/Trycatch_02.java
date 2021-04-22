package day18.pkg;

import java.util.*;

public class Trycatch_02 {

	public static void main(String[] args) {
		// 나눗셈을 할 때
		// a/b 에서 b가 0이면 발생하는 예외를 확인하고 
		// 예외처리를 할 수 있는 코드를 작성해보자.
		// 예외가 발생하는 경우 "0으로 나눌 수 없습니다." 를 출력.
		
		Scanner scan = new Scanner(System.in);
		int num , num2 = 0;
		int sum = 0;
		
		try {
		System.out.print("첫번째 숫자를 입력하세요 : ");
		num = scan.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		num2 = scan.nextInt();
		sum = num/num2;
		System.out.println("결과는 "+sum+" 입니다.");
		
		}catch (Exception e){
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
			// catch 를 하나만 쓸 수 있는건 아니다.
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
