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
		if(season!="봄"|| season!="여름" || season!="가을" || season!="겨울")
		this.season = season;
	}
	
	

}
