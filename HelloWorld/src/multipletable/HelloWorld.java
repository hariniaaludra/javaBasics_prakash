package multipletable;

public class HelloWorld {
	
	void print() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(5 + "*" + "=" + 5 * i);
		}
	}

	void print(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
		}

	}

	void print(int n, int from, int to) {

		for (int i = from; i <= to; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
		}
	}

}
