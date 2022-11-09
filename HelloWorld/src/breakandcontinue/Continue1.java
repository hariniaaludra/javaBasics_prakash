package breakandcontinue;

import java.util.Scanner;

public class Continue1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner c=new Scanner(System.in);
		int n=c.nextInt();
		for(int i=0;i<=n;i++)
		{
			if(i==7)
			
				continue;
			System.out.println(i);
			
		}
		
	}
	

}
