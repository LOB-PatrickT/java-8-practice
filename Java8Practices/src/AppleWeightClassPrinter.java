
public class AppleWeightClassPrinter implements AppleDetailPrinter {

	@Override
	public String prettyPrinter(Apple apple) {
		return apple.getWeight() > 150? "Heavy" : "Light";
	}

}
