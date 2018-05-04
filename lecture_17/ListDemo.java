package lecture_17;

import java.util.*;

/*
 * Golovach Courses
 * Java Core January: Collection. Лекция #17 (Часть 3)
 * https://youtu.be/NNsQ0zaFJJw
 */

public class ListDemo {

	public static void main(String[] args) {

		List<User> list = new ArrayList<>();

		list.add(new User(25, "Mike"));

		System.out.println(list.contains(new User(25, "Mike")));
		System.out.println(list.contains(new User(18, "Sara")));

		list.add(new User(18, "Sara"));

		System.out.println(list.contains(new User(25, "Mike")));
		System.out.println(list.contains(new User(18, "Sara")));

	}

}

class User {

	private int age;
	private String name;

	public User(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@SuppressWarnings("unused")
	private void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@SuppressWarnings("unused")
	private void setName(String name) {
		this.name = name;
	}

	@SuppressWarnings("unused")
	private String getName() {
		return name;
	}

	@Override
	public boolean equals(Object o) {

		if (o == null || getClass() != o.getClass())
			return false;

		if (!(o instanceof User))
			return false;

		User that = (User) o;

		if (age != that.age)
			return false;
		if (name != null ? name.equals(that.name) : that.name != null)
			;

		return true;
	}

	@Override
	public int hashCode() {
		int result = age;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}
}