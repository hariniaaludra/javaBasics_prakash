package itarator;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Iterator;
import java.util.Scanner;

class Itarator {
	public static void main(String[] args) {
		
		System.out.println("Enter the input");
		ArrayList<Integer> l = new ArrayList<>();
		Scanner c = new Scanner(System.in);
		int d = c.nextInt();
		System.out.println("enter the arraylist:");
		for (int i = 0; i < d; i++) {
			l.add(c.nextInt());
		}
		System.out.println("String the element:" + l);
		Iterator<Integer> rt = l.iterator();//if it is listiterator we should be change to l.Size() into bracket
		System.out.println("remove the element:");
		Scanner b = new Scanner(System.in);
		int e = b.nextInt();
		while (rt.hasNext()) {
			Integer j = rt.next();
			
			if (j.equals(e)) {
				rt.remove();
		 
		   
			   
		   }
		
				}
			
		System.out.println(l);
		c.close();
		b.close();
	}
}




//public class Itarator {
//	public static void main(String[] args) {
//		System.out.println("enter the array list:");
//		 ArrayList<Integer> l=new ArrayList<>();
//       
//         Scanner input=new Scanner(System.in);
//
//          Integer a =input.nextInt();
//          l.add(a);
//           l.add(a);
//	System.out.println(l);
//	Iterator<Integer> c=bi.iterator();
//	while (c.hasNext()) {
//	    Integer a = c.next();
//	  //  System.out.println(next);
//	 
//	    if( a==10) {
//	    	c.remove();
//	        System.out.println(a);
//	        
//	    }
//	    }}
