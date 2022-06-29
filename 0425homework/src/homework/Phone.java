package homework;

public class Phone {
	//public static final String company = null;
	String company;
	String color;
	private int year;
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year<2000 || year>2022)
			return;
		this.year = year;
	}
	

}
