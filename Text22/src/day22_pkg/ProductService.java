package day22_pkg;

import java.util.*;

public class ProductService {

	
	Scanner scan=new Scanner(System.in);
	
	List<ProductDTO> Scan(List<ProductDTO>list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	return list;	
	}
	
	List<ProductDTO>Modify(List<ProductDTO>list){
		System.out.print("상품 번호을 입력:");
		int pNumber=scan.nextInt();
		for(int i=0; i<list.size(); i++) {
			if(pNumber==(list.get(i).getpNumber())) {
				System.out.print("수정할 상품가격 :");
					int pPrice=scan.nextInt();
					System.out.print("수정할 재고량 :");
					int pStock=scan.nextInt();
					list.get(i).setpPrice(pPrice);
					list.get(i).setpStock(pStock);
					System.out.println(list.get(i));
					
					}
			
		}return list;
	}
					
	
	
	List<ProductDTO>Delete(List<ProductDTO>list){
		System.out.print("삭제 할 상품 번호를 입력하세요:");
		int pNumber=scan.nextInt();
		for(int i=0; i<list.size(); i++) {
			if(pNumber==(list.get(i).getpNumber())) {
				list.remove(i);
					
				}
			}return list;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

