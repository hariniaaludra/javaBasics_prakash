package itarator;

import java.util.ArrayList;
import java.util.Iterator;


public class Itarator {
	public static void main(String[] args) {
		ArrayList<Integer> c= new ArrayList<>();
		c.add(10);
		c.add(13);
		c.add(54);
		c.add(98);
	Iterator<Integer> i=c.iterator();
	while(i.hasNext()) {
		Integer c1=i.next();
		if(c1 < 10) {	
		
        i.remove();
		}
	}
	
		System.out.println(i.next());
	
		
	}

}
