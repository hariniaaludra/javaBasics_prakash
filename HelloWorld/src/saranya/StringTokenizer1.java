package saranya;

import java.util.StringTokenizer;

public class StringTokenizer1 {
	public static void main(String[] args) {
		StringTokenizer c=new StringTokenizer("prakash"," ");
		System.out.println(c.countTokens());
		while(c.hasMoreElements())
		{
			System.out.println(c.nextElement());
			
		
		}
		while(c.hasMoreTokens())
		{
			System.out.println(c.nextToken());
		}
		
	}

}
