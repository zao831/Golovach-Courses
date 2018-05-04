package lecture_09;

/*
 * Golovach Courses
 * Java Core: Потоки. Лекция #9
 * https://youtu.be/b7dCgNoerTY
 */

public class BlockedSetExample {

	public static void main(String[] args) {

		BlockedSetExample ref = new BlockedSetExample();

		for (int k = 0; k < 5; k++) {
			new Thread(new BlockedMethodCaller(ref, k)).start();
		}
	}

	public synchronized void f(int x) {
		System.out.print("+" + x + "/");
		try {
			Thread.sleep(1000);
			// this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("-" + x);
	}
}