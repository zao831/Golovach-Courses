package lecture_18;

/*
 * Golovach Courses
 * Java Core January: Collection. Лекция #18 (Часть 3)
 * https://youtu.be/SR8IZ1SxcR4
 */

public class Point {

	private final int x;
	private final int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public int hashCode() {
		return x + y;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}

		Point that = (Point) obj;
		if (this.x != that.x)
			return false;
		if (this.y != that.y)
			return false;
		return true;
	}

	@Override
	public String toString() {
		// TODO Автоматически созданная заглушка метода
		return super.toString();
	}

}
