import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AppleFilter {
	
	public static void main(String[] args) {
		
		List<Apple> apples = Arrays.asList(
		new Apple(170, "green"),
		new Apple(160, "red"),
		new Apple(166, "green"),
		new Apple(149, "red"),
		new Apple(110, "green"),
		new Apple(200, "red"),
		new Apple(130, "green"),
		new Apple(135, "red"),
		new Apple(220, "green"),
		new Apple(80, "red"),
		new Apple(174, "green"));
	
//		List<Apple> filteredGreenApples = filterApples(apples, new AppleGreenColorPredicate());
//		List<Apple> filteredGreenApplesLambdas = filterApples(apples, (Apple apple) -> "green".equals(apple.getColor()));
//		filteredGreenApplesLambdas.forEach(System.out::println);
		
		
//		List<Apple> filteredLightRedApples = filterApples(apples, new AppleRedAndLightPredicate());
//		filteredLightRedApples.forEach(System.out::println);
		
//		prettyPrintApples(apples, new AppleWeightClassPrinter());
//		prettyPrintApples(apples, new AppleWeightPrinter());
		
		Collections.sort(apples, (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));
		apples.forEach(System.out::println);
		
	}
	
	public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate pred) {
		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			if(pred.test(apple)) {
				result.add(apple);
			}
		}
		
		return result;
	}
	
	public static void prettyPrintApples(List<Apple> inventory, AppleDetailPrinter printer) {
		for(Apple apple: inventory) {
			String output = printer.prettyPrinter(apple);
			System.out.println(output);
		}
	}
}
