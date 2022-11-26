package suriya;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {
	public static void main(String[] args) {
		ArrayList<Integer> c= new ArrayList<>();
		c.add(1);
		c.add(4);
		c.add(68);
		c.add(9);
		c.add(543);
		c.add(6);
		c.add(8);
		c.add(12);
		Iterator<Integer> al=c.iterator();
	while(al.hasNext()) {
		int c1=al.next();
		if(c1%2==0&&c1%3==0) {
			al.remove();
			
		}
	}
	
	System.out.println(c);
}
}