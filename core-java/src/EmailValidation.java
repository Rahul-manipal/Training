
public class EmailValidation {
    
	//1- min 4 chars before @
	//2- min 3 chars between @ and .
	//3- min 2 chars after .
	//4- only 1 occurrence of @ and . is allowed
	//Note: No regular expression is allowed
	
	public static boolean isValidEmail(String email)
	{
		int at_index = email.indexOf('@');
	    int dot_index = email.indexOf('.');
	    
	    if(at_index <=0 || dot_index<= at_index+1 || dot_index>=email.length()-1)
	    	return false;
	    
	    int at_count=0;
	    int dot_count=0;
	    for(char c: email.toCharArray())  //.toCharArray convert the email string into an array of characters
	    {
	    	if(c=='@') {at_count++;}
	    	else if(c=='.') {dot_count++;}
	    	else if(!Character.isLetterOrDigit(c) && c !='_' && c != '-') {return false;}  //Invalid character found
	    }
	    
	    return at_count == 1 && dot_count ==1   //only 1 occurrence of @ and . is allowed
	    		&& email.substring(0, at_index).length()>=4    //min 4 chars before @
	    		&& email.substring(at_index +1, dot_index).length()>=3    //min 3 chars between @ and .
	    		&& email.substring(dot_index + 1).length()>=2;    //min 2 chars after .
	}
	
	public static void main(String[] args) {
		String email = "zubair@gmail.com";
		
		if(isValidEmail(email))
		System.out.println("valid email");
		else System.out.println("Invalid email");
	}
	

}
 
// int iat = email.IndexOf('@');
// int idot = email.IndexOf('.');
//if(iat == email.lastIndexOf('@') && idot == email.lastIndexOf('.') && iat >= 4 && (idot-iat) >= 3 && (email.length() >=2)
   // sopln("valid")
  // else sopln("invali