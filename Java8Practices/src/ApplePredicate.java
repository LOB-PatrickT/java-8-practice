import java.util.function.Predicate;

public interface ApplePredicate extends Predicate<Apple> {
	
	boolean test(Apple apple);

}
