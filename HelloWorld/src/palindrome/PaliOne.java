package palindrome;

import java.util.Scanner;

public class PaliOne {
		

		public static void main(String[] args) {
System.out.println("enter the naem:");
		    Scanner c=new Scanner(System.in);
		    String str=c.nextLine();
		    
		    String reversestr=" ";
		    
		    int strLength = str.length();

		    for (int i = strLength - 1; i >=0; --i) {
		     reversestr =reversestr + str.charAt(i);
		    }

		    if(reversestr.equals(str)) 
		    {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }
		    c.close();
		  }
		}

