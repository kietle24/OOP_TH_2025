package hascode_equal;

public class Execute {
	public static void main(String[] args) {
		Person p1 = new Person("haha");
		Person p2 = p1;
		System.out.println(p1.equals(p2));
	}
}
