
public class MyRunnable implements Runnable {

	private int data;

	public void run() {
		Thread t = Thread.currentThread();// it tells which thread are running currently.
		String name = t.getName();
		for (int c = 1; c <= 50; c++)
			System.out.println(name + ": " + ++data);
	}

	public static void main(String[] args) {
		Runnable mr = new MyRunnable();

		Thread t1 = new Thread(mr);
		t1.setName("First");

		Thread t2 = new Thread(mr, "Second");
		Thread t3 = new Thread(mr, "Third");

		t1.start();
		t2.start();
		t3.start();

		// because of console limitation output is coming in random way bcz console is
		// single type of thread and runs one thread at a time
	}

}
