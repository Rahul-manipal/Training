
public class RegexDemo {

	public static void main(String[] args) {
		String name = "Zubair";
		String mobile = "743826412";
		String email = "zubair@gmail.com";
		
		 String nameRegex = "[A-Z]{1}[a-z]{3,}";
		 String mobileRegex = "[6-9]{1}[0-9]{9}";
		 String emailRegex = "/^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})$/";
		 
		 System.out.println(name.matches(nameRegex)? "Valid name" : "Invalid email");
		 System.out.println(mobile.matches(mobileRegex)?"valid mobile no" : "invalid mobile no");
		 System.out.println(email.matches(emailRegex)?"valid email": "invalid email");

	}

}
