package a;

public class Test {

	public static void main(String[] args) {
		MultiThreadExample thread1 = new MultiThreadExample("Thread 1");
		MultiThreadExample thread2 = new MultiThreadExample("Thread 2");

		thread1.start();
		thread2.start();
	}

}
