package lecture_08;

/*
 * Golovach Courses
 * Java Core: Потоки. Лекция #8
 * https://youtu.be/0FvbIGNUl8A
 */

public class PrintThread implements Runnable {
	String b;
	int a;

	public PrintThread(String name, int time) {
		this.b = name;
		this.a = time;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(a);
				System.out.print(b + "\n");
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}
}