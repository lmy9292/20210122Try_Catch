package day22_pkg;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner (System.in);
		boolean run= true;
		
		List<ProductDTO> list =new ArrayList<ProductDTO>();
		ProductDTO pr=null;
		ProductService ps=new ProductService();
		
		int select=0;
		
		while(run) {
			System.out.println("--------------------------------------------");
			System.out.println("1.상품등록 |2.전체상품조회 |3.상품정보수정 |4.상품삭제");
			System.out.println("--------------------------------------------");
			System.out.print("입력 >");
			select=scan.nextInt();
			
			switch(select) {
			case 1:
				pr= new ProductDTO();
				System.out.print("상품명 :");
				String pName =scan.next();
				System.out.print("상품가격 :");
				int pPrice =scan.nextInt();
				System.out.print("재고량 :");
				int pStock = scan.nextInt();
				pr.setpName(pName);
				pr.setpPrice(pPrice);
				pr.setpStock(pStock);
				int pNumber= list.size()+1;
				pr.setpNumber(pNumber);
				list.add(pr);
				break;
			case 2:
				list=ps.Scan(list);
				break;
			case 3:
				list=ps.Modify(list);
				break;
			case 4:
				list=ps.Delete(list);
				break;
			case 5:
				run = false;
				break;
			}	
				
				
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
