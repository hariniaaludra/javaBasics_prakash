package breakandcontinue;

import java.util.Scanner;

public class break1 {
	public static void main(String[] args) {
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
