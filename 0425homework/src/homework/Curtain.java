package homework;

public class Curtain {
	String color;
	static int width;
	static int height;
	private String season;
	
	
	public String getSeason() {
		return season;
	}
	public void setSeason(String season) {
		if(season!="��"|| season!="����" || season!="����" || season!="�ܿ�")
		this.season = season;
	}
	
	

}
