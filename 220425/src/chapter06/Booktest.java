package chapter06;

public class Booktest {

	public static void main(String[] args) {
		//Book b = new Book(); //한 권의 책 만든 것.
		Book [] bookArr = new Book[3];//책은 안만들었지만 책을 만들수 있는 공간 3개를 형성한 것.
		
		for(int i=0; i<bookArr.length; i++) {
			bookArr[i]= new Book();
			 //for구문으로 배열 책을,, 어떻게 
		}
		
		bookArr[0] = new Book();
		bookArr[0].setTitle("자바의 정석");
		bookArr[0].setWriter("남궁성");
		bookArr[0].setCompany("도우출판");
		bookArr[0].setYear(2016);
		
		
		/*b.setTitle("자바의 정석");
		b.setWriter("남궁성");
		b.setCompany("도우출판");
		b.setYear(2020);*/   //책 한권만 만들었을 때 
		
		//System.out.println("제목: "+b.getTitle());
		//System.out.println("저자: "+b.getWriter());
		//System.out.println("출판사: "+b.getCompany());
		//System.out.println("출판년도: "+b.getYear());
		
		//b.bookinf();
		for(int i=0; i<bookArr.length; i++) {
			bookArr[i].bookinf(); //배열은 배열이름[0] 이 형태 필수!!
		}
		
		

	}

}
