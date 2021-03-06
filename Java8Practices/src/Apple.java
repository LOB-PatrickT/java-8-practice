
public class Apple {
	
	private Integer weight;
	private String color;
	
	public Apple(Integer weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return "Apple Details = Weight: " + this.weight + " Color: " + this.color;
	}
}
