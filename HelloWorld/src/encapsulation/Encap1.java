package encapsulation;

public class Encap1 {
	
	
		//private int a=10;
	
	 private String b="in side the class";
	   // private int c=121;
	  
	   public String getB() {
		return b;
	
	}


	public void setB(String b) {
		   this.b = b;
	   
	    
	
	}	    
	    public static void main(String[] args) {
	    Encap1 b=new Encap1();
	  // String v= b.data();
	    	System.out.println(b);
	    }
}


//		public int getC() {
//			return c;
//		}
//
//
//		public void setC(int c) {
//			this.c = c;
//		}
//
//
//		public String getB() {
//			return b;
//	
//		}
//
//
//		public void setB(String b) {
//			this.b = b;
//			//this.c= c;
//		}
//
//		public int getA() {
//			return a;
//		}
//
//		public void setA(int a) {
//			this.a = a;
//		}
//	
//
//
//
//	
//}
