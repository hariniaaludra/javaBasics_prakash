package MethodOverloading;

public class Calculate {
	int sum(int a, int b) {
		return a*b;
	}
		void sum(int a ,float b) {
			float k=a+b;
			System.out.println(k);
	}

}
