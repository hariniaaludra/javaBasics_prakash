package aswathy;

public class Hierarchical {
	
	   public void methodA()
	   {
	      System.out.println("10");
	   }
	}
	class Data extends Hierarchical
	{
	   public void methodB()
	   {
	      System.out.println("coffee");
	   }
	}
	class Information extends Hierarchical
	{
	  public void methodC()
	  {
	     System.out.println("Coimbatore");
	  }
	}
	class Value extends Hierarchical
	{
	  public void methodD()
	  {
	     System.out.println("Thudiyalor");
	  }
	}
	class Examples
	{
	  public static void main(String[] args)
	  {
		  Data obj1 = new  Data();
	     Information obj2 = new  Information();
	     Value obj3 = new Value();
	     obj1.methodA();
	     obj2.methodC();
	     obj3.methodA();
	  }
	}


