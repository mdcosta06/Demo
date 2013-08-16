
public class Movie {
	String name;
	int price;
	private int pricecode;
	
	public Movie(String n, int mprice){
		this.name=n;
		this.price=mprice;
	}
	
	public int priceCode(){
		return pricecode;
	}
	
	public String getName(){
		return name;
	}
}
