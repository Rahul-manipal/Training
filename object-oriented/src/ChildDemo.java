
public class ChildDemo<Z, S> extends Generic<Z> {
	private S dummy;

	public ChildDemo(Z data, S dummy) {
		super(data);
		this.dummy = dummy;
	}

	public S getDummy() {
		return dummy;
	}

	public void setDummy(S dummy) {
		this.dummy = dummy;
	}

	public static void main(String[] args) {
		ChildDemo<String, Integer> cd1 = new ChildDemo<String, Integer>("jack", 33);
		System.out.println(cd1.getData() + "\t" + cd1.getData());
	}

}
