////yha sb thread kaa apna state hai isliye output 50 hii ayega kvi v is spe jyda nhi aayega .

public class MyThread extends Thread {

	private int data;

	public void run() {
		String name = Thread.currentThread().getName();// it tells which thread are running currently.

		for (int c = 1; c <= 50; c++)
			System.out.println(name + ": " + ++data);
	}

	public static void main(String[] args) {
		MyThread mt1 = new MyThread();
		mt1.setName("First");

		MyThread mt2 = new MyThread();
		mt2.setName("second");

		MyThread mt3 = new MyThread();
		mt3.setName("Third");

		mt1.setPriority(MIN_PRIORITY);// ye yha pe priority set kr dega but its not gurantee bcz hr thread kuchh
										// specific millisecond ke liye run kr rha hoga
		mt3.setPriority(MAX_PRIORITY);

		mt1.start();
		mt2.start();
		mt3.start();

		String name = Thread.currentThread().getName();// it tells about the main thread aur ye thoda phle finish hoga
														// compare to other threads bcz ye phle se exist kr rha hai

		for (int c = 1; c <= 50; c++)
			System.out.println(name + ": " + c);

	}
}
