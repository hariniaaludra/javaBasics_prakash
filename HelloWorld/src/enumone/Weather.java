package enumone;

public class Weather {
//	private static Object WINTER;

	public static void main(String[] args)
	{
		
	Season[] s =  Season.values();
		for(int a=0;a<=s.length;a++) {
		if(a==0) {
			
		
		System.out.println(s[a]+" "+s[a].getValue());  
	  
	}

	}
}
}