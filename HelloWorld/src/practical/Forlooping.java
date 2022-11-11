package practical;

import java.util.Scanner;

public class Forlooping {
	public static void main(String[] args) {
		System.out.println("Enter the value:");
		Scanner n=new Scanner(System.in);
		int col=n.nextInt();

		for(int i=1;i<=col;i++)
			
		{
			for(int j=i;j<=col;j++)
			{
				System.out.print(" ");
			}
			int itr=i;
		for(int k=i;k>0;k--) {
				System.out.print(itr+++" "); 
			}
		System.out.println();
		}
	
	n.close();

}
}
