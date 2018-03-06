
public class AppleWeightPrinter implements AppleDetailPrinter {

	@Override
	public String prettyPrinter(Apple apple) {
		return String.valueOf(apple.getWeight());
	}

}
