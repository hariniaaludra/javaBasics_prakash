package inheritance;

public class SonA {
	int a=10;
}
   class B extends SonA {
		 int b=10;
		 int c=20;
}
  class C extends B{
			 int d=4;
  
	     C() {
		System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
			 }
 
}

