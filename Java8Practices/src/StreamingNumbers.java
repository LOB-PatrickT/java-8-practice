import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamingNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 2, 6, 7, 8, 4, 9);
		numbers = numbers.stream().filter(i -> i % 2 == 0).distinct().collect(Collectors.toList());
		numbers.forEach(System.out::println);
	}
}
