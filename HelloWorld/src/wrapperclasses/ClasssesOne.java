package wrapperclasses;

public class ClasssesOne {


//private static final String a = null;

public static void main(String[] args) {
	int a=10;//normal variable

	//@SuppressWarnings("removal")
	@SuppressWarnings("removal")
	Integer obj=new Integer(a);//wrapper class boxing
	int c = obj;//unboxing
	//int b=obj;
	System.out.println(c);

	
}
}
