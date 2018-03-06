
public class AppleRedAndLightPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return apple.getColor().equals("red") && apple.getWeight() < 150;
	}

}
