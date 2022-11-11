package practical;

import java.util.Arrays;
import java.util.Scanner;


public class Array1 {
	
	public void charData() {
		System.out.println("Enter the charData value:");
		Scanner h=new Scanner(System.in);
		int[] a=new int[h.nextInt()]; 
		
	for(int i=0;i<=a.length-1;i++)
	{
		
	
		a[i]=h.nextInt();
		
	}
	Arrays.sort(a);
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
	}
	h.close();
	}
public void charOne() {
	System.out.println("Enter the charOne value:");
	Scanner h=new Scanner(System.in);
	int[] a=new int[h.nextInt()]; 
	int[] a2=new int[h.nextInt()];
	for(int i=0;i<=a.length-1;i++)
	{
		a[i]=h.nextInt();
	}
	
	System.out.println("enter the value a2:");
	
	for(int i=0;i<=a2.length-1;i++)
	{
a2[i]=h.nextInt();
}
	boolean b1=Arrays.equals(a,a2);
	System.out.println(b1);

h.close();
}
public void charTwo() {
	System.out.println("Enter the charTwo value:");
	Scanner h=new Scanner(System.in);
	int[] a=new int[h.nextInt()];
System.out.println("Enter the array value a :");	
for(int i=0;i<=a.length-1;i++)
{
	

	a[i]=h.nextInt();
	
}
int[] b=Arrays.copyOf(a, 4);
for(int i=0;i<=a.length-1;i++)
{
System.out.println(b[i]);
}
h.close();
}
	public static void main(String[] args) {
		Array1 ver=new Array1();
	  ver.charData();
	  ver.charOne();
	   ver.charTwo();	   
		
		
	}
}