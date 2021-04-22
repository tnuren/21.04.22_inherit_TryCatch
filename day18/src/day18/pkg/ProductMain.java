package day18.pkg;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {
		
		//상품등록, 전체상품조회, 상품정보수정, 상품삭제
		
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int select = 0;
		int pNumber = 0;
		int pPrice = 0;
		int pStock = 0;
		String pName = "";
		List<ProductDTO> list = new ArrayList<ProductDTO>();
		ProductService ps = new ProductService();
		
		while(run) {
			System.out.println("----------------------------------------------------------");
			System.out.println(" 1. 상품등록  ㅣ  2.전체상품조회  ㅣ  3.상품정보수정  ㅣ  4.상품삭제  ");
			System.out.println("----------------------------------------------------------");
			System.out.print("입력 > ");
			select = scan.nextInt();
			
			if(select == 1) {
				ProductDTO p1 = new ProductDTO();
				pNumber=list.size() +1;
				p1.setpNumber(pNumber);
				System.out.print("상품명을 입력하세요 : ");
				pName = scan.next();
				p1.setpName(pName);
				System.out.print("상품가격을 입력하세요 : ");
				pPrice = scan.nextInt();
				p1.setpPrice(pPrice);
				System.out.print("재고량을 입력하세요 : ");
				pStock = scan.nextInt();
				p1.setpStock(pStock);
				list.add(p1);
			} else if (select == 2) {
				list = ps.scan(list);
			} else if (select == 3) {
				list = ps.transfer(list);
			} else if (select == 4) {
				list = ps.delet(list);
			}
			
			
			
		}
		
		
		
		
		
		
		

	}

}
