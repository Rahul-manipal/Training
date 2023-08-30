//creating generic class - supports everything but problem with object is that is it also generic so anytime we change object to anytype
public class Generic<Z> {
	private Z data;

	public Generic(Z data) {
		this.data = data;
	}

	public Z getData() {
		return data;
	}

	public void setData(Z data) {
		this.data = data;
	}

	public static void main(String[] args) {
		Generic g1 = new Generic("Hola");
		g1.setData(3.14);// creating problem bcz of generic object
		System.out.println(g1.getData());

		Generic g2 = new Generic(99);
		g1.setData(3.14);
		System.out.println(g2.getData());

		Generic g3 = new Generic(new Person("kim", 21));
		System.out.println(g3.getData());
	}

}