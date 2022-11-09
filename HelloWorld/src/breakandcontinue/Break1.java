package breakandcontinue;

import java.util.Scanner;

public class Break1 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner g=new Scanner(System.in);
		int n=g.nextInt();
				
		//for(int i=3;i<=n;i++)
		while(true)
		{
			if(n%10==0)
			{
				System.out.println(n);
				break;
				
			}
			n--;
		}
		
			}

}
