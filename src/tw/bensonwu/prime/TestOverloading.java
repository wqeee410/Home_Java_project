package tw.bensonwu.prime;

public class TestOverloading {

	public static void eat(int rice) {
		System.out.println(rice);
	}
	public static void eat(String rice) {
		System.out.println("string");
	}
	public static void eat(boolean rice) {
		System.out.println("boolean");
	}
}
