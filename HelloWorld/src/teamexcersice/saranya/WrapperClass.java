package teamexcersice.saranya;

public class WrapperClass {
	public static void main(String[] args) {
		int c=10;
		byte p=13;
		char d='c';
		float f=0.5f;
		double e=2.4D;
		long l=123455;
		short a=1;
		
	//autoboxing	//primitive to wrapper object
		Integer intobj1=c;
		Byte byteobj=p;
		Character charobj=d;
		Float floatobj=f;
		Double doubleobj=e;
		Long longobj=l;
		Short shortobj=a;
		System.out.println(intobj1);
		System.out.println(byteobj);
		System.out.println(charobj);
		System.out.println(floatobj);
		System.out.println(doubleobj);
		System.out.println(longobj);
		System.out.println(shortobj);
		//unboxing object to primitive
		int f1=intobj1;
		byte b1=byteobj;
		char c1= charobj;
		float d1=floatobj;
		double e1=doubleobj;
		long g1=longobj;
		short s1=shortobj;
		System.out.println(f1);
		System.out.println(b1);
		System.out.println(c1);
		System.out.println(d1);
		System.out.println(e1);
		System.out.println(g1);
		System.out.println(s1);
		
	}

	
		
		
}

		
		
		
		
		
		
		
	
