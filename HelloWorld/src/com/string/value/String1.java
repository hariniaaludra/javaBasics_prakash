package com.string.value;
//string is  sequence of character
public class String1 {

	//private static CharSequence t;

	public static void main(String[] args) {
		String a=" prakash";
		char[] ch={'p','r','a','k','a','s','h'};
		String s=new String(ch);
//why string class is immutable because we cannot be modified or alternate the value 
		String x="prakash";
		String y="naveen";
		x.concat(y);
		System.out.println(x);
//string comparsion in java for three way 1)equalis(),s1,s2 both ==s1,s3
		String g="ganesan";
		String h="noobie";
		String m=new String(g);
		System.out.println(g.equals(h));
		System.out.println(m.equals(g));
		System.out.println(g==h);
		System.out.println(m==g);
//String concatination 
		
       String s1= h.concat(g);
       System.out.println(s1);
//String String charAt()
		String c ="prakash yfugi tyfug";//char ch=h.charAt(9);
		int StrLength=c.length();
		//System.out.println(n.charAt(0));
		//char ch1 =c.charAt(2); //char ch1=c.charAt(3)
		System.out.println(StrLength);
		
		//String replace
		String d="prakash ertyu rtyu";
		String[] l=d.split("\\s");
		System.out.println(l);
		//String tochararray
		String u="prakash";
		char[] ch1=u.toCharArray();
		for(int i=0;i<u.length();i++)
		{
			
			System.out.println(ch1[i]);
		
		}
		
		
	}

}


