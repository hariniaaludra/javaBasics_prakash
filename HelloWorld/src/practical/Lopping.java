package practical;

public class Lopping {
	public void forLoops(){
	int a = 0;
	int b = 0;
	for (int i = 0; i <= 100; i++) {
		if (i % 2 == 0) {
			a += i;
		}
		if (i % 5 == 0) {
			b += i;
		}
	}
	System.out.println(a);
	System.out.println(b);
	
}
public void whileLoops() {
	
	int a = 0;
	int b = 0;
	int i=1;
	while(i<=100) {
		if (i % 2 == 0) {
			a += i;
		}
		if (i % 5 == 0) {
			b += i;
		}
		i++;
	}
	System.out.println(a);
	System.out.println(b);
	
}
public void doWhile() {
	int a = 0;
	int b = 0;
	int i=1;
	do{
	if (i % 2 == 0) {
		a += i;
	}
	if (i % 5 == 0) {
		b += i;
	}
	i++;
}while(i<=100);
	System.out.println(a);
	System.out.println(b);
}
public static void main(String[] args) {	
	
	Lopping loop=new Lopping();
	loop.forLoops();
	loop.whileLoops();
	loop.doWhile();
}
}


