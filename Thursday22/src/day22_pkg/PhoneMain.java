package day22_pkg;

public class PhoneMain {

	public static void main(String[] args) {
		// Phone 클래스 객체
		Phone p=new Phone();
		p.company="회사1";
		p.hangOn();
		//CellPhone 클래스 객체
		CellPhone cp=new CellPhone();
		// CellPhone 이 가지고 있는 필드 사용
		cp.button="버튼10개";
		cp.message="메세지 내용";
		
		//CellPhone 객체로 Phone필드 사용
		cp.company="회사2";
		cp.model="전화기 1";
		//Phone이 가지고 있는 메소드 호출
		cp.hangOff();
		//재정의한 메소드를 호출하면 재저의된 내용만 실행됨.
		cp.hangOn();
		p.hangOn();
		SmartPhone sp=new SmartPhone();
		sp.company="회사 2";//Phone의 필드
		sp.button="터치폰";//CellPhone의 필드
		sp.type="5G";//SmartPhone의 필드
		
		sp.call("여보세요");//Phone의 메소드
		sp.hangOn();//CellPhone이 재정의한 메소드
		sp.hangOff();//SmartPhone이 재정의한 메소드
		
		
		
		
		
		
		
		
		
		
		
		
	}

}