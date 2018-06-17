public class MutableIntegerRunner {

	public static void main(String[] args) {

		MutableInteger integer1 = new MutableInteger();
		MutableInteger integer2 = new MutableInteger();
		// Threads are using different objects and don't
		// interact with each other
		Thread thread1 = new Thread(new IncrementingRunnable(integer1));
		Thread thread2 = new Thread(new IncrementingRunnable(integer2));
		
		System.out.println(thread1);
		System.out.println(thread2);

	}
}
