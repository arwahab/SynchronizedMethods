public class MutableInteger {

	private int value;

	// adding sync JVM guarantees that only 1 thread can execute increment()
	// method at a time
	public synchronized void increment() {
		value++;
	}

	// adding sync JVM guarantees that only 1 thread can execute getValue()
	// method at a time
	public synchronized int getValue() {
		return value;
	}

}