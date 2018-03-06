import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStreamingObjects {
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person(17, "Patrick", "badminton"), 
				new Person(17, "Patrick", "badminton"),
				new Person(17, "Riebby", "badminton"));
		people = people.stream().distinct().collect(Collectors.toList());
		people.forEach(System.out::println);
		
		List<PersonDetail> personDetails = people.stream().map(PersonDetail::mapPerson).collect(Collectors.toList());
		personDetails.forEach(System.out::println);
	}
	
}

class Person {
	int age;
	String name;
	String hobby;
	
	public Person(int age, String name, String hobby) {
		super();
		this.age = age;
		this.name = name;
		this.hobby = hobby;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((hobby == null) ? 0 : hobby.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null) {
			if(!(this.age == ((Person) obj).age && this.name.equals(((Person) obj).name) && this.hobby.equals(((Person) obj).hobby))) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		return this.name + "-" + this.age + "-" + this.hobby;
	}
	
}

class PersonDetail {
	String name;
	String hobby;
		
	public PersonDetail(String name, String hobby) {
		super();
		this.name = name;
		this.hobby = hobby;
	}

	public static PersonDetail mapPerson(Person person) {
		return new PersonDetail(person.name, person.hobby);
	}
	
	@Override
	public String toString() {
		return this.name + " & " + this.hobby;
	}
}


