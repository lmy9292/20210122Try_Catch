package day22_pkg;

public class TryCatch_01 {

	public static void main(String[] args) {
		/*
		 * 예외(Exception) 처리
		 * try {
		 * 실행할 내용
		 * 
		 * 
		 * }catch(익셉션이름 e){
		 * 해당 예외(익셉션)가 발생할 경우 실행할 내용
		 * }
		 */
		try {
			int[] num=new int[3];
			//인덱스는 0,1,2 이렇게 3개가 있다
			num[2]=10;
			System.out.println("try 마지막줄");
		}catch(Exception e) {
			System.out.println("배열크기 초과");
			e.printStackTrace();//익셉션에 관한 구체적인 설명을 보여주는것
		}finally {
			System.out.println("예외가 나든안나든 무조건 여기는 나옵니다.");
		}
			System.out.println("try catch 끝나고");		
		
				
			
		
		

		
		
		
		
		
		
		
		
		
		
		
	}

}
