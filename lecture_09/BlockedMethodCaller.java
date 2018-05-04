package lecture_09;

/*
 * Golovach Courses
 * Java Core: Потоки. Лекция #9
 * https://youtu.be/b7dCgNoerTY
 */

public class BlockedMethodCaller implements Runnable {
	BlockedSetExample ref;
	int k;

	public BlockedMethodCaller(BlockedSetExample ref, int k) {
		 this.k = k;
		 this.ref = ref;
	}

	@Override
	public void run() {
		ref.f(k);
	}
}