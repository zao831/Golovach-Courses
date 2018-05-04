package lecture_08;

/*
 * Golovach Courses
 * Java Core: Потоки. Лекция #8
 * https://youtu.be/0FvbIGNUl8A
 */

public class UsePrintThread2 {

	public static void main(String[] args) throws InterruptedException {

		PrintThread a = new PrintThread("B", 1000);
		Thread t = new Thread(a);
		t.start();

		t.join();

		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
			System.out.print("A");
		}
	}
}