import static java.util.Comparator.comparing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestConstructorReference {
	static List<Orange> oranges;

	public static void main(String[] args) {

		BiFunction<Integer, String, Orange> f1 = Orange::new;
		Orange o1 = f1.apply(120, "Africa");

		Supplier<Object> s1 = Object::new;
		Object obj = s1.get();

		makeOranges();
		
		System.out.println("Before sorting by weight: \n" + oranges);
		Function<Orange, Integer> func1 = Orange::getWeight;
		oranges.sort(comparing(func1));
		System.out.println("After sorting by weight: \n" + oranges);
		Function<Orange, String> func2 = Orange::getCountry;
		oranges.sort(comparing(func1).thenComparing(func2));
		System.out.println("After sorting by weight and by country: \n" + oranges);

	}

	public static void makeOranges() {
		List<Integer> weights = Arrays.asList(6, 8, 11, 5, 6);
		List<String> countries = Arrays.asList("Philippines", "Canada", "Zimbabwe", "Hungary", "Brazil"); 
		mapAppleInfo(weights, countries, Orange::new);
	}

	public static void mapAppleInfo(List<Integer> weights, List<String> countries, BiFunction<Integer, String, Orange> func) {
		oranges = new ArrayList<>();
		
		int ctr = 0;
		for (Integer weight : weights) {
			oranges.add(func.apply(weight, countries.get(ctr++)));
		}
	}
	
}
