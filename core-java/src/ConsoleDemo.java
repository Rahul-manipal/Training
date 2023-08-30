import java.util.Scanner;

public class ConsoleDemo {

	public static void main(String[] args) {
		 
		Scanner console = new Scanner(System.in);
		 System.out.println("enter name");
		 String name = console.next();
		 System.out.println("enter age");
		 int age = console.nextInt();
		 
		 System.out.println("your name: " + name);
		 System.out.println("your age: " + age);
		 
		 
	}

}
