import java.io.Serializable;

public class Person  implements Serializable {//we are making it agrement by doing serializable
	private String name;
	private transient int age;	// it will never be serializable
	
	public Person() {
	}
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [Name=" + name + ", Age=" + age + "]";
	}
}
