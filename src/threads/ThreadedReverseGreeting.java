package threads;

public class ThreadedReverseGreeting {
	public static void main(String[] args) {
		hello(50);

	}

	public static void hello(int i) {
		System.out.println("Hello from Thread <" + i + ">!");
		if (i > 0) {
			Thread t1 = new Thread(() -> {
				hello(i - 1);
			});
			t1.run();

		}

		

	}
	// Write a program that creates a thread (Thread 1) that creates another thread
	// (Thread 2);
	// Thread 2 creates Thread 3; and so on, up to Thread 50.
	// Each thread should print "Hello from Thread <num>!",
	// but you should structure your program such that the threads print their
	// greetings in reverse order.
}