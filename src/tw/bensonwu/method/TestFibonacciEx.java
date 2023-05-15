package tw.bensonwu.method;

class Fibonacci {
	int count = 1;
	long total = 0, next = 1, temporary = 0;

	public void f(int i) {
		
		total = temporary;

		if (count == i) {
			System.out.print(total + "  ");
			count = 1;
			total = 0;
			next = 1;
			temporary = 0;
			return;
		} else {
			count++;
			temporary = next;
			next = total + next;
			f(i);
		}

	}

}

public class TestFibonacciEx {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		
		fibonacci.f(1);
		
	
		
	}
}
