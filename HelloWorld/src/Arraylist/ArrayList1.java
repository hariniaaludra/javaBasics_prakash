package Arraylist;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList1 {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//ArrayList al=new ArrayList();
		LinkedList al=new LinkedList();
		for(int i=0;i<=10;i++) {
			al.add(i);
		}
			System.out.println(al);
			//break;
			
			
			al.add(10);
		al.add(20);
		al.add(30);
		al.add("String");
		al.add(1,30);
		al.add(5,3);
		System.out.println(al);
		System.out.println(al.get(1));
		System.out.println(al.set(4,2));
		System.out.println(al);
				
	}
}
