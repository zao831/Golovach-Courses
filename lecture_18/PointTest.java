package lecture_18;

import java.util.*;

/*
 * Golovach Courses
 * Java Core January: Collection. Лекция #18 (Часть 3)
 * https://youtu.be/SR8IZ1SxcR4
 */

public class PointTest {

	public static void main(String[] args) {

		HashSet<Point> set = new HashSet<>();

		set.add(new Point(1, 2));

		System.out.println(set.contains(new Point(1, 2)));
		System.out.println(set.contains(new Point(2, 1)));
		
		set.add(new Point(2, 1));
		
		System.out.println(set.contains(new Point(2, 1)));

	}
}
