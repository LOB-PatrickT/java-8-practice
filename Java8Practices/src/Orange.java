
public class Orange {
	
	private int weight;
	private String country;

	public int getWeight() {
		return weight;
	}
	
	public String getCountry() {
		return country;
	}
	
	public Orange(int weight, String country) {
		this.weight = weight;
		this.country = country;
	}
	
	public String toString() {
		return "Orange Info: " + "Weight: " + weight + " & Country Origin: " + country;
	}
}
