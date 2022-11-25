package stringtoken;
import java.util.Scanner;
import java.util.StringTokenizer; 

public class StrTokens {
public static void main(String[] args) {
	Scanner c=new Scanner(System.in) ;
	  String ver=c.nextLine();
	 StringTokenizer st = new StringTokenizer(ver);  
	 System.out.println("Total number of Tokens: "+st.countTokens());    
	 
	     while (st.hasMoreElements())   
	     {    
	         System.out.println(st.nextElement());    
	         
	       
	    
	 }
	     c.close();
}

}

