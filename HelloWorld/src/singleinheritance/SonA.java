package singleinheritance;

public class SonA {
	int a=10;
}
   class B extends SonA {
		 int e=10;
		 int c=20;
}
  class Data extends B{
			 int d=4;
  
	     Data() {
		System.out.println(a);
        System.out.println(e);
        System.out.println(c);
        System.out.println(d);
			 }
 
}

