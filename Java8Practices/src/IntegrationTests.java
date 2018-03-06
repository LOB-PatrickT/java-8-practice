import java.util.function.Function;

public class IntegrationTests {
	public static void main(String[] args) {
		//Function<StringBuilder, StringBuilder> appendString = str -> str + "test";
		
		//System.out.println(integrate(str -> str + " test", "hello world"));
		System.out.println(integrate(s -> s.append(s), "hello world"));
	}
	
	public static StringBuilder integrate(Function<StringBuilder, StringBuilder> appendFunc, String text) {
		return appendFunc.apply(new StringBuilder("test"));
	}
}
