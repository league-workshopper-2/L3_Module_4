package threads;

public class ThreadedReverseGreeting {
	public static void main(String[] args) {
		hello(50);
			
	
	}
	public static void hello(int i) {
		if (i>1) {
			hello(i-1);
		}
		for (int j = 0; j < i; j++) {
			Thread t1 = new Thread(()->{

				System.out.println("Hello from Thread <" + i + ">!");
			});
		}
		
	}
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
}
