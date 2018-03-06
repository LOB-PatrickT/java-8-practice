import java.util.function.Predicate;

public class TestPredicates {
	public static void main(String[] args) {
		Predicate<Apple> redApplePred = (Apple a) -> a.getColor().equalsIgnoreCase("red");
		Predicate<Apple> notRedApplePred = redApplePred.negate();
		Predicate<Apple> redAndHeavyApplePred = redApplePred.and(a -> a.getWeight() > 150);
		Predicate<Apple> redAndHeavyAppleOrGreenPred = redAndHeavyApplePred.or(a -> a.getColor().equalsIgnoreCase("green"));
		
		Apple redApple = new Apple(160, "red");
		Apple greenApple = new Apple(160, "green");
		System.out.println(redApplePred.test(redApple)); // true
		System.out.println(redAndHeavyApplePred.test(redApple)); // true
		System.out.println(notRedApplePred.test(greenApple)); // true
		System.out.println(redAndHeavyAppleOrGreenPred.test(greenApple)); //true
	}
}
