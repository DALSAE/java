package chapter06;

public class Book {
	private String title;
	private String writer;
	private String company; 
	private int year;
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year<0 || year>2022)
			return;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	public void bookinf() {
		System.out.printf("����: %s%n ����: %s%n ���ǻ�: %s%n ���ǳ⵵: %d%n", title, writer, company, year);
	}
	

}
