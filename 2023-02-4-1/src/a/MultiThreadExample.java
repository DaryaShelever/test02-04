package a;

public class MultiThreadExample extends Thread {

	public MultiThreadExample(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(i + " - " + getName());
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
