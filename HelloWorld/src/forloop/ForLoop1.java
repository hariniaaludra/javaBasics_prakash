package forloop;

import java.util.Scanner;

public class ForLoop1{
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner n=new Scanner(System.in);
		int c = n.nextInt();
		for(int i=3;i<=c;i++)
		{
			System.out.println(i);
		}
	}

}
