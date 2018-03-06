import java.util.function.Function;

public class LetterFormatter {
	
	static String text = "I purchased a brand new B18C5 Type R Engine --- labda";
	
	public static String addHeader(String text) {
		return "From Patrick, Mario and Nikki: \n\n" + text;
	}
	
	public static String addFooter(String text) {
		return text + "\n\nKind regards";
	}
	
	public static String checkSpelling(String text) {
		return text.replaceAll("labda", "lambda");
	}
	
	public static void main(String[] args) {
		Function<String, String> addHeaderFunc = LetterFormatter::addHeader;
		Function<String, String> addFooterFunc = LetterFormatter::addFooter;
		Function<String, String> checkSpellingFunc = LetterFormatter::checkSpelling;
		Function<String, String> formatterFunc = checkSpellingFunc.andThen(addFooterFunc.compose(addHeaderFunc));
		System.out.println(formatterFunc.apply(text));
	}
	
	
}
