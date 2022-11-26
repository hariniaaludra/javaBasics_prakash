package gomathi;


import java.util.Scanner;

// a word and numbers or sentence reads the same backward or forward
public class Palindrome {
	public static void main(String[] args) {
		
		System.out.println("enter the c value:");
		 Scanner m=new Scanner(System.in);
		  String c=m.nextLine();
		 String ver="";
		
		 for(int i=c.length()-1;i>=0;i--) {
		 char ch=c.charAt(i);	
		 ver=ver+ch;
		 }
		 System.out.println(ver);
		 
		
	 if(ver.equals(c)) {
			 		 
		 System.out.println("its palindrime");
		 }
		 else
			 System.out.println("not a palindrome");
			 
		 }
	
	}


