public class IncrementingRunnable implements Runnable {

	private final MutableInteger mutableInteger;

	public IncrementingRunnable(MutableInteger mutableInteger) {
		this.mutableInteger = mutableInteger;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10_000; i++) {
			mutableInteger.increment();
		}
	}

}
