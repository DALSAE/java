package chapter06;

public class Booktest {

	public static void main(String[] args) {
		//Book b = new Book(); //�� ���� å ���� ��.
		Book [] bookArr = new Book[3];//å�� �ȸ�������� å�� ����� �ִ� ���� 3���� ������ ��.
		
		for(int i=0; i<bookArr.length; i++) {
			bookArr[i]= new Book();
			 //for�������� �迭 å��,, ��� 
		}
		
		bookArr[0] = new Book();
		bookArr[0].setTitle("�ڹ��� ����");
		bookArr[0].setWriter("���ü�");
		bookArr[0].setCompany("��������");
		bookArr[0].setYear(2016);
		
		
		/*b.setTitle("�ڹ��� ����");
		b.setWriter("���ü�");
		b.setCompany("��������");
		b.setYear(2020);*/   //å �ѱǸ� ������� �� 
		
		//System.out.println("����: "+b.getTitle());
		//System.out.println("����: "+b.getWriter());
		//System.out.println("���ǻ�: "+b.getCompany());
		//System.out.println("���ǳ⵵: "+b.getYear());
		
		//b.bookinf();
		for(int i=0; i<bookArr.length; i++) {
			bookArr[i].bookinf(); //�迭�� �迭�̸�[0] �� ���� �ʼ�!!
		}
		
		

	}

}
