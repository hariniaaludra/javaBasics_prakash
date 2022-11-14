package encapsulation;

public class Encap2 {
//	 private String b="";
//	 public String getB() {
//			return b;
//	
	String b="out side the class";
//public void 

	public static void main(String[] args) {
	Encap1 ver=new Encap1();
System.out.println(ver.getB());
ver.setB("Prakash");
System.out.println(ver.getB());
ver.setB("out side the class");
System.out.println(ver.getB());


	//String c=ver.getB();
	//System.out.println(c);
	//Encap2 ver =new Encap2();
	//System.out.println(ver.data);
}
}
//	ver.setA(10);
//	int c=ver.getA();
//	System.out.println(c);
//	ver.setB("prakash");
//	String n=ver.getB();
//	System.out .println(n);
//	ver.setC(12);
//	int s=ver.getC();
//    System.out.println(s);

//}//