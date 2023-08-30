
public class TestAlphaBeta {
	
	public static void main(String[] args) {
		Alfa a = new Alfa();
		a.demo();
		
		Beta b = new Beta();
		b.test();
		b.demo();
		
		Alfa ab = b;// up casting
		ab.demo();
		//ab.test();//error
		Beta ba = (Beta) ab;// down casting
		ba.demo();
		ba.test();
	}

}
