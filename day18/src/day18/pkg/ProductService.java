package day18.pkg;

import java.util.*;

public class ProductService {

	int number = 0;
	int stock = 0;
	int price = 0;
	Scanner scan = new Scanner(System.in);

	// 전체 상품 조회
	List<ProductDTO> scan(List<ProductDTO> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		return list;
	}

	// 상품 정보 수정
	List<ProductDTO> transfer(List<ProductDTO> list) {
		ProductDTO p1 = new ProductDTO();
		System.out.print("상품번호를 입력하세요 : ");
		number = scan.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (number == list.get(i).getpNumber()) {
				System.out.print("상품가격을 수정합니다 : ");
				price = scan.nextInt();
				list.get(i).setpPrice(price);
				System.out.print("재고량을 수정합니다 : ");
				stock = scan.nextInt();
				list.get(i).setpStock(stock);
			}

		}
		return list;
	}
	// 상품삭제
	List<ProductDTO> delet(List<ProductDTO> list) {
		System.out.print("삭제할 상품번호를 입력하세요 : ");
		number = scan.nextInt();
		for (int i = 0; i < list.size(); i++) {
			if (number == list.get(i).getpNumber()) {
				list.remove(i);
			}

		}
		return list;
	}

}