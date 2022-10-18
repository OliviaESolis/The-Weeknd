public class MostPopular{
	String MostPopularOne ="Blinding Lights";
	String MostPopularTwo ="Starboy";
	public MostPopular() {}
	public void setMostPopularOne(String newMostPopular) {
		MostPopularOne = newMostPopular;
	}
	public void getMostPopular(int num) {
		if(num == 1) {
			System.out.println("The Weeknds most popular song is "+MostPopularOne+".");
		}else {
			System.out.println("The Weeknds second most popular song is "+MostPopularTwo+".");
		}
	}
}