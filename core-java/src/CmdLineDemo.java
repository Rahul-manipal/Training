
public class CmdLineDemo {

	public static void main(String[] args) {
		int sum =0;
		for (String a : args) {
			System.out.println(a);
			
		    sum = sum + Integer.parseInt(a);
			
		}
		System.out.println(sum);
		
		
		
		int x =5;
		Integer xo = x;
		int z =xo;
		System.out.println(x + xo * z);

	}
	
	
	

}
